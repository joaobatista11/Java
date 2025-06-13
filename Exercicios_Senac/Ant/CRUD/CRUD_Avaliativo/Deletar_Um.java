
package CRUD_Avaliativo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Deletar_Um {
    public void deletar_um(String nome){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "delete from animais where nome = ?;";

        try(PreparedStatement ps = conexao.prepareStatement(sql)){

            ps.setString(1, nome);
            ps.executeUpdate();
            System.out.println("Animal deletado com sucesso!");

        }catch(SQLException e){
            System.out.println("Erro ao deletar animal");
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