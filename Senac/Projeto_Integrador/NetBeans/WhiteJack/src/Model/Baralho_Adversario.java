
package Model;

public class Baralho_Adversario {
    private int id, valor,soma;
    private String carta;

    public Baralho_Adversario(int id, String carta, int valor) {
        super();
        this.id = id;
        this.carta = carta;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }
}
