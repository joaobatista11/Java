
package Exercicio_10_HashSet_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_9_Lista_do_Alfabeto {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        char p;
        int n,qtd;
        System.out.println("Digite a quantidade da lista");
        n = tecla.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(i + ". Digite uma letra");
            p = tecla.next().charAt(0);
            set.add(p);

        }        
        for (char abc : set) {
            System.out.println(abc);
        }
        qtd = set.size();
        System.out.println("\n"+qtd);
    }
}
       