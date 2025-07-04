
package DAO;

import Controller.Conexao;
import java.sql.Connection; // faz a conexao

public class BD {
private static Connection connect = null;

    public static void main(String[] args) {
        try{
        connect = Conexao.getConn().abrir_conexao();
            System.out.println("Jogo criado com sucesso");
        }catch(Exception e){
            System.out.println(e.getMessage()); //ou e.printStackTrace();
            System.exit(0);
        }
        
    }

}
