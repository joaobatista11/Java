
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_6_Substituir_Elementos {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        String p;
        for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Escreva uma fruta");
            p = tecla.nextLine();
            lista.add(p);
                    }
                        lista.set(2,"Morango");
        
                    for (String frutas : lista) {
                        System.out.println(frutas);
            
                    
                      
            }
    }
}
