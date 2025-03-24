package Exercicio_10_HashSet_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_2_Lista_de_Frutas {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String p;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Escreva uma fruta");
            p = tecla.nextLine().toLowerCase();
            set.add(p);

        }
        System.out.println("Escreva uma fruta pra remover");
        p = tecla.nextLine().toLowerCase();        
        if (set.contains(p)) {
            set.remove(p);
        }
        for (String frutas : set) {
            System.out.println(frutas);
        }
    }
}
