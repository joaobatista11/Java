package Exercicio_11_Metodos_Intermediaria;

import static java.util.Arrays.sort;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_5_Maior_Valor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Quantos numeros voce quer somar?");
        t = sc.nextInt();
        int[] n = new int[t];
        for (int c = 0; c < t; c++) {
            System.out.println((c + 1) + ". Digite um numero");
            n[c] = sc.nextInt();
        }
        System.out.println("O maior numero: "+maiornumero(n,t)+"\nO menor numero: "+menornumero(n,t));
    }

    public static int maiornumero(int[] n, int t) {
        sort(n);
        return n[1];

    }

    public static int menornumero(int[] n, int t) {
        sort(n);

        return n[0];
    }
}
