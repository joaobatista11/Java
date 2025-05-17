
package Exercicio_10_HashSet_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_8_Lista_Remover_Sao_Paulo {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String p;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Escreva um nome de cidade");
            p = tecla.nextLine().toLowerCase();
            set.add(p);

        }
        if (set.contains("sao paulo")) {
            set.remove("sao paulo");
        }
        for (String cidades : set) {
            System.out.println(cidades);
        }
    }
}
