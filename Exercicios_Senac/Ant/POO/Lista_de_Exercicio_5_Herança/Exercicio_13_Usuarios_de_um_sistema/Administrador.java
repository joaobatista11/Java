
package Lista_de_Exercicio_5_Herança.Exercicio_13_Usuarios_de_um_sistema;

public class Administrador extends Usuario{

    public Administrador(String nome, String login) {
        super(nome, login);
    }

    public void status(){
        System.out.println("Administrador\nNome: "+this.getNome()
                +"\nLogin: "+this.getLogin());
    }
    
}
