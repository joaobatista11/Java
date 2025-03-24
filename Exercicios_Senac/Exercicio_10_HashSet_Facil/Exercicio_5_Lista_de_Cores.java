package Exercicio_10_HashSet_Facil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_5_Lista_de_Cores {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            String p;
            System.out.println(i + ". Escreva uma cor");
            p = tecla.nextLine();
            set.add(p);
            lista.add(p);
        }
        System.out.println("\nHashSet\n");
        for(String cores: set){
            System.out.println(cores);
        }
        System.out.println("\nArrayList\n");
        for(String cores: lista){
            System.out.println(cores);
        }
    }
}
