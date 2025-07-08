
package DAO;

import Controller.Conexao;
import Model.Baralho_Jogador;
import Model.Embaralhamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO {

    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    
    private static String adicionar_carta = "Insert into baralho_jogador (id, carta, valor) values (null, ?, ?);";
    private static String listar_cartas = "select * from baralho_jogador where 1 = 1;";
    private static String excluir_cartas = "truncate baralho_jogador;";
    private static String somar_cartas = "select sum(valor) from baralho_jogador;";    
    //public DAO {
public void adicionar_carta() throws SQLException {
    Embaralhamento rd = new Embaralhamento();
    rd.embaralhar();

    // Cria o baralho_jogador com os dados sorteados
    Baralho_Jogador baralho = new Baralho_Jogador(1, rd.getCarta(), rd.getValor());

    Connection connection = Conexao.getConn().abrir_conexao();
    connection.setAutoCommit(false);

    try {
        ps = connection.prepareStatement(adicionar_carta);
        int i = 1;
        ps.setString(i++, baralho.getCarta());
        ps.setInt(i++, baralho.getValor());
        ps.executeUpdate(); // ← Use isso para INSERT
        connection.commit();
    } catch(SQLException e) {
        e.printStackTrace();
        connection.rollback(); // ← Importante em caso de erro
    } finally {
        if (ps != null) ps.close();
        if (connection != null) connection.close();
    }
}
        public ArrayList<Baralho_Jogador>listar_cartas() throws SQLException{
            Connection connection = Conexao.getConn().abrir_conexao();
            ArrayList<Baralho_Jogador> cartas_jogador = new ArrayList<>();
            connection.setAutoCommit(false);

            try{
            ps = connection.prepareStatement(listar_cartas);
            rs = ps.executeQuery();
            while(rs.next()){
            cartas_jogador.add( new Baralho_Jogador(rs.getInt("id"), rs.getString("carta"), rs.getInt("valor")));
            }
            }catch(SQLException e){
                e.printStackTrace();            
            }
        return cartas_jogador;
}        
public void excluir_cartas() throws SQLException {
    Embaralhamento rd = new Embaralhamento();
    Baralho_Jogador baralho = new Baralho_Jogador(1, rd.getCarta(), rd.getValor());
    Connection connection = Conexao.getConn().abrir_conexao();
    connection.setAutoCommit(false);
    //System.out.println("Teste 11");
    try {
        ps = connection.prepareStatement(excluir_cartas);
        ps.executeUpdate(); // ← Use isso para INSERT
        connection.commit();
    } catch(SQLException e) {
        e.printStackTrace();
        //connection.rollback(); // ← Importante em caso de erro
        if (connection != null) connection.rollback();
    } finally {
        if (ps != null) ps.close();
        if (connection != null) connection.close();
    }
}

public int somar_cartas() throws SQLException {
 int soma = 0;

    Connection connection = Conexao.getConn().abrir_conexao();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        ps = connection.prepareStatement(somar_cartas);
        rs = ps.executeQuery();

        if (rs.next()) {
            soma = rs.getInt("valor"); // ou rs.getInt(1)
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (connection != null) connection.close();
    }

    return soma;
}
}  

        
        