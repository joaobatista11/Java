
package Lista_de_Exercicio_5_Herança.Exercicio_14_Eventos;

public abstract class Evento {
private String nome, data;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }
    
}
