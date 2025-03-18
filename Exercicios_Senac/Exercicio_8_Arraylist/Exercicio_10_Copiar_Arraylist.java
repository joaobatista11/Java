
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_10_Copiar_Arraylist {
    public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = lista;
   Scanner tecla = new Scanner(System.in);
        String p;
        for (int c = 1; c <= 4; c++){
               System.out.println(c + ". Escreva um nome de um animal");
            p = tecla.nextLine();
            lista.add(p);
                    }
                    
        System.out.println("Lista de animais\n");                
    for (String nome : lista){
        System.out.println(nome);
    }
        System.out.println("\nLista de animais copia\n");
    for (String nome2 : lista2){
        System.out.println(nome2);
    
    }
    }
}
