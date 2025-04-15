
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_30 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        HashSet<String> inter = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro HashSet");
        for (int i = 1; i <=5; i++) {
            System.out.println(i+". Escreva uma palavra:");    
        set1.add(sc.nextLine().toLowerCase());
        }
        System.out.println("Segundo HashSet");
        for (int i = 1; i <=5; i++) {
            System.out.println(i+". Escreva uma palavra:");    
        set2.add(sc.nextLine().toLowerCase());
        }
        for(String comp: set1){
        inter.add(comp);
        }
        for(String comp: set2){
        inter.add(comp);
        }
        System.out.println("Terceiro HashSet");
        for(String lista: inter){
            System.out.println(lista);
        }
    }
}
