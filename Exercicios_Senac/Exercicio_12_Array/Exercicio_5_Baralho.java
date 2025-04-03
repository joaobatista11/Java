
package Exercicio_12_Array;

import java.util.Random;

public class Exercicio_5_Baralho {
    public static void main(String[] args) {
              String[]baralho = new String [52];
        String[]naipes = {"Copas","Ouros", "Paus", "Espadas"};
        String[]valores = {"As", "2", "3","4","5","6","7","8","9","10", "Valete", "Dama", "Rei"};
       
        Random rd = new Random();
        System.out.println("Suas cartas\n");
        for (int i = 0; i < 9; i++) {
        String cartaAleatoria = valores[rd.nextInt(valores.length)] + " de " + naipes[rd.nextInt(naipes.length)];
            System.out.println(cartaAleatoria);            
        }
        
    }
}
