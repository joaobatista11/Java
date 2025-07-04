
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/baralho_bd"; // caminho do MySQL (nome do database)
    private static final String USUARIO = "root";
    private static final String SENHA = "root";    
    private static Connection connection;
    private static Conexao conn;
    
    //private conexao(){}

    public static Conexao getConn(){
    if(conn == null){
    conn = new Conexao();
    }
    return conn;
    }
    
    public Connection abrir_conexao(){
        try{
            //
            connection = DriverManager.getConnection(URL,USUARIO,SENHA);
            System.out.println("Sucesso a conexão ao banco de dados");            
            return connection;
            //
        }catch(SQLException e){ // ClassNotFoundException e

            System.out.println("Erro ao conectar ao banco de dados"+e.getMessage());
        }
            return connection;

            //public void fechar_conexao()
    }
}