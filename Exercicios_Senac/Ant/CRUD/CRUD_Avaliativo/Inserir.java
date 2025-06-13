
package CRUD_Avaliativo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
class Inserir{
    public void inserir(String nome, String grupo){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "INSERT INTO animais (nome, grupo) VALUES (?,?);";

        try(PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, grupo); 
            ps.executeUpdate();
            System.out.println("animal inserido com sucesso!");
            
        }catch(SQLException e){ //
            System.out.println("Erro ao inserir animal");
            e.printStackTrace();
        
        }finally{
            try{
            conexao.close();
            }catch(SQLException e){
        e.printStackTrace();            
            }
        }
        }
    }
}
