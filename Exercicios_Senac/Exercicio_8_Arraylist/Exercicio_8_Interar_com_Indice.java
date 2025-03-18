
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_8_Interar_com_Indice {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        String p;
        for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Escreva um nome de um pais");
            p = tecla.nextLine();
            lista.add(p);
                    }
                    for (String pais : lista) {
                        System.out.println(pais);
            
            }
    }
}
