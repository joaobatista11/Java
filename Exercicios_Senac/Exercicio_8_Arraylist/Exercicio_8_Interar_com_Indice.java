
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_8_Interar_com_Indice {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        ArrayList<String> interseccao = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        String p;
        for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Escreva um nome de um pais");
            p = tecla.nextLine();
            lista.add(p);
                    }
        lista2.add("Brasil");
        lista2.add("Estados Unidos");
        lista2.add("Argentina");
        lista2.add("China");
        lista2.add("Espanha");
        lista2.add("Russia");
        
                    for (String nome : lista) {
if (lista2.contains(nome)) {
interseccao.add(nome);
}
}
        System.out.println("\nLista de paises verificados\n");                    
                    for (String nome2 : interseccao) {
                        System.out.println(nome2);
                    }
    }
}
