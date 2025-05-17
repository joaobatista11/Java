
package Exercicio_11_Metodos_Intermediaria;

import java.util.ArrayList;
import static java.util.Arrays.sort;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_2_Array_Crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, s = 0;
        double m = 0;
        System.out.println("Quantos numeros voce quer somar?");
        t = sc.nextInt();
        int[] n = new int[t];
        for (int c = 0; c < t; c++) {
            System.out.println((c + 1) + ". Digite um numero");
            n[c] = sc.nextInt();
        }
   Crescente(n);
        System.out.println("\nLista em ordem crescente\n");
        for(int ordem: n){
        System.out.println(ordem);
        }
    }
    public static int[] Crescente(int[] n) {
        sort(n);
        return n;
    }
}
