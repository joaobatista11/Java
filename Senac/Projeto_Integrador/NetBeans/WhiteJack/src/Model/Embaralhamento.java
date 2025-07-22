
package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Embaralhamento {
    private ArrayList<String> naipes = new ArrayList<>(Arrays.asList("Copas", "Ouros", "Paus", "Espadas"));            
    private ArrayList<String> cartas = new ArrayList<>(Arrays.asList("Ás", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "Valete", "Dama", "Rei"));         

    private String carta;
    private int valor;

    public void embaralhar() {
        Collections.shuffle(cartas);
        Collections.shuffle(naipes);
        this.carta = cartas.get(0) + " de " + naipes.get(0);
        setValor(cartas.get(0)); // só a parte da carta (Ás, 2, 3...)
    }

    public String getCarta() {
        return carta;
    }

    public int getValor() {
        return valor;
    }

    private void setValor(String carta) {
        switch (carta) {
            case "Ás": valor = 11; break;
            case "Valete":
            case "Dama":
            case "Rei":
            case "10": valor = 10; break;
            default: valor = Integer.parseInt(carta); break;
        }
    }
}