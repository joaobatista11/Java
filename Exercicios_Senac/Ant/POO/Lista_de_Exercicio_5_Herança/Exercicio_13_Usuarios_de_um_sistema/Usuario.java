
package Lista_de_Exercicio_5_Herança.Exercicio_13_Usuarios_de_um_sistema;

public class Usuario {
private String nome, login;

    public Usuario(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

}
