
package com.mycompany.projeto;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz_com_Interacao {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c,l;
        System.out.println("Digite a quantidade de linha");
        l=sc.nextInt();
        System.out.println("Digite a quantidade de coluna");
        c=sc.nextInt();        
        int[][]matriz = new int[l+1][c+1];
        for (int linha = 1; linha < l+1; linha++) {
            for (int coluna = 1; coluna < c+1; coluna++) {
                System.out.println("Elemento ["+linha+"]["+coluna+"]:");
                matriz[linha][coluna]=sc.nextInt();
            }
        }
            System.out.println("Sua matriz");
        for(int[] r: matriz){
        System.out.println(Arrays.toString(r));
    }       
    }
}
