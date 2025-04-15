
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_27 {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String p;
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + ". Escreva um nome de uma fruta");
            p = sc.nextLine().toLowerCase();
            if (p.startsWith("a")||p.startsWith("e")||p.startsWith("i")||p.startsWith("o")||p.startsWith("u")) {
                lista.add(p);
            }
        }

        System.out.println("\nFrutas que comecam com vogais\n");
        for (String nomes : lista) {
            System.out.println(nomes);
        }
    }
}
