
package Model;

public class Baralho_Jogador {
    private int id, valor;
    private String carta;
    
    public Baralho_Jogador(int id, String carta, int valor) {
        super();
        this.id = id;
        this.carta = carta;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public String getCarta() {
        return carta;
    }

}
