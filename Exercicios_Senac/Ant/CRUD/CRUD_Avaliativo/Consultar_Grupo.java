package CRUD_Avaliativo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
class Consultar_Grupo {
    public void consultar_grupo(String grupo){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
        String sql = "select * from animais where grupo = ? order by nome asc;";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, grupo);  // Passando o nome que você quer buscar (pesquisa)

                try (ResultSet resultado = ps.executeQuery()) {
                System.out.println("Grupo "+grupo+" selecionado(a)");
                while(resultado.next()){
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    System.out.println("ID: "+id+"\nNome: "+nome);
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
