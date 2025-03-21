
package Exercicio_9_For_Each_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_5_HashSet_de_Strings {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet <String> set = new HashSet<>();
        String p;
        System.out.println("Escreva o nome da lista");
        p = tecla.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+". Escreva uma palavra da lista: "+p);
            set.add(tecla.nextLine());
        }
        System.out.println("\n"+p+"\n");
        for(String carac: set){
            System.out.println(carac);
        }
    }
}
