
package Lista_de_Exercicio_5_Herança.Exercicio_15_Midias;

public class Midia {
private String titulo;
private int duracao;

    public Midia(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

}
