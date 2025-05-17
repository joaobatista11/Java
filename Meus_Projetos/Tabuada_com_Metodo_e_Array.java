package com.mycompany.projeto;

import java.util.Arrays;
import java.util.Scanner;

public class Tabuada_com_Metodo_e_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero");
        n = sc.nextInt();
        System.out.println("\nTabuada de " + n + "\n\n" + Arrays.toString(tabuada(n)));
    }

    public static int[] tabuada(int n) {
        int[] m = new int[10];
        for (int i = 0; i < 10; i++) {
            m[i] = n * (i + 1);
        }
        return m;
    }
}
