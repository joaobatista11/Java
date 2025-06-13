package CRUD_Avaliativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
class Consultar_Tudo {
    public void consultar_tudo(){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "select * from animais order by nome asc;";
            try (PreparedStatement ps = conexao.prepareStatement(sql);
                ResultSet resultado = ps.executeQuery()){
                System.out.println("Lista de Animais");
                while(resultado.next()){
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    String grupo = resultado.getString("grupo");
                    System.out.println("ID: "+id+"\nNome: "+nome+"\nGrupo: "+grupo);
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