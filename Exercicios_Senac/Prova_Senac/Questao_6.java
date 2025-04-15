
package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Digite o tamanho dos arrays:");
        t=sc.nextInt();
        int[]a= new int[t];
        int[]b= new int[t];
        System.out.println("\nArray 1");        
        for (int i = 0; i < t; i++) {
            System.out.println(i+1+". Digite um numero:");
            a[i] = sc.nextInt();
        }
        System.out.println("\nArray 2");        
        for (int i = 0; i < t; i++) {
            System.out.println(i+1+". Digite um numero:");
            b[i] = sc.nextInt();
        }
        if(verificar(a,b)){
            System.out.println("Sao iguais");
        }else{
            System.out.println("Nao sao iguais");
        }
    }

    private static boolean verificar(int[] a, int[] b) {
    if (Arrays.equals(a, b)){    
        return true;
    }else{
    return false;
    }
    }
}
