
package CRUD_Avaliativo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Criar_Tabela {
public void criar(){
        ConexaoBD cbd = new ConexaoBD();
        Connection c = cbd.conectar();
        
        
        if(c != null){
        String sql = "CREATE TABLE IF NOT EXISTS animais("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(50),"
                + "grupo VARCHAR(50)"
                + ");";
        try(PreparedStatement ps = c.prepareStatement(sql)){
            ps.execute();
            System.out.println("Tabela 'animais' criada com sucesso!");
        }catch(SQLException e){
            System.out.println("Erro ao criar a tabela 'animais'");           
        e.printStackTrace();
        
        }finally{
            try{
            c.close();
            }catch(SQLException e){
        e.printStackTrace();            
            }
        }
        }
    }
}
