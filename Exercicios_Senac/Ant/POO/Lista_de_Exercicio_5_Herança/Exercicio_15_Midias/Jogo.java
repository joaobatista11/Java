
package Lista_de_Exercicio_5_Herança.Exercicio_15_Midias;

public class Jogo extends Midia{
private String plataforma;
private int classificacao;       
    public Jogo(String titulo, int duracao, String plataforma, int classificacao) {
        super(titulo, duracao);
        this.classificacao = classificacao;
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

}
