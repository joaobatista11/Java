
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_5_Tamanho_da_Lista {
    public static void main(String[] args) {
        ArrayList<Character> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        char p ;
    for (int c = 1; c <= 4; c++){
        p = tecla.next().charAt(0);                    
        lista.add(p);
                    }
        
                    
                     int t = lista.size();
        System.out.println("\nNa lista contem "+t+" linhas");
    }
}
