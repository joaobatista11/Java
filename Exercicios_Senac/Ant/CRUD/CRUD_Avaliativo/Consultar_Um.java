package CRUD_Avaliativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
class Consultar_Um {
    public void consultar_um(String nome){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "select * from animais where nome = ?;";
            
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, nome);  // Passando o nome que você quer buscar (pesquisa)

                try (ResultSet resultado = ps.executeQuery()) {
                while(resultado.next()){
                    
                    int id = resultado.getInt("id");
                    nome = resultado.getString("nome");
                    String grupo = resultado.getString("grupo");
                System.out.println("animal encontrado");
                    
                    System.out.println("ID: "+id+"\nNome: "+nome+"\nGrupo: "+grupo);
                }
                    }     
        }catch(SQLException e){
                System.out.println("Erro ao consultar animal");
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
