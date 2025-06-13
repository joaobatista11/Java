
package CRUD_Avaliativo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Deletar_Tudo {
    public void deletar_tudo(){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "truncate animais;"; // ? dado que será inserido

        try(PreparedStatement ps = conexao.prepareStatement(sql)){

            ps.executeUpdate();
            System.out.println("Animais deletados com sucesso!");

        }catch(SQLException e){
            System.out.println("Erro ao deletar animais");
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