package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_15 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String p;
        int t=0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Escreva uma palavra");
            p = sc.nextLine().toLowerCase();
            for (char l : p.toCharArray()) {
                if (l == 'e') {
                    set.add(p);
                }
            }
        }
        t = set.size();
        System.out.println("Palavras que contem a letra 'e': "+t);        
    }
}
