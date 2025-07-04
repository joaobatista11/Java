package CRUD_Avaliativo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Deletar_Grupo {
    public void deletar_grupo(String grupo){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "delete from animais where grupo = ?;"; // ? dado que será inserido
//            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
//                ps.setString(1, grupo);
        try(PreparedStatement ps = conexao.prepareStatement(sql)){

            ps.setString(1, grupo);
            ps.executeUpdate();
            System.out.println("Grupo deletado com sucesso!");
        //}
        }catch(SQLException e){
            System.out.println("Erro ao deletar grupo");
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