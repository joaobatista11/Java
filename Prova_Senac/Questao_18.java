
package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class Questao_18 {
    public static void main(String[] args) {
//        int[][] matriz = { // Declara e inicializa uma matriz 3x3
// {1, 0, 0},
// {0, 1, 0},
// {0, 0, 1}
// };
//        System.out.println("A matriz\n");
//    for(int[] r: matriz){
//        System.out.println(Arrays.toString(r));
//    }
        Scanner sc = new Scanner(System.in);
int[][]matriz = new int[4][4];
        for (int linha = 1; linha < 4; linha++) {
            for (int coluna = 1; coluna < 4; coluna++) {
                System.out.println("Elemento ["+linha+"]["+coluna+"]:");
                matriz[linha][coluna]=sc.nextInt();
            }
        }
        System.out.println("Sua matriz\n");
    for(int[] r: matriz){
        System.out.println(Arrays.toString(r));
    }    
        boolean identidade = true;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if(linha==coluna && matriz[linha][coluna] != 1){
                identidade = false;
                }else if (linha != coluna && matriz[linha][coluna]!= 0){
                identidade = false;
                }
            }
        }
        if(identidade){
            System.out.println("\nE uma matriz identidade");
        }else{
            System.out.println("\nNao e uma matriz identidade");
        }
    }
}
