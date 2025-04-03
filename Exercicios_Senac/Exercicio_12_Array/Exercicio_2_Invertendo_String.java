
package Exercicio_12_Array;

import java.util.Scanner;

public class Exercicio_2_Invertendo_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tecla = new Scanner(System.in);        
        int t;
        String p,r;
        System.out.println("Quantos elementos voce quer?");
        t = sc.nextInt();
        String[] a = new String[t];
        for (int i = 0; i < t; i++) {
            System.out.println((i+1)+". Escreva uma palavra:");
            p = tecla.nextLine();
        r = new StringBuilder(p).reverse().toString();
            a[i] = r;        
        }
        for (int c = 0; c < t; c++) {        
        System.out.println(a[c]);
        }
        
    }
}
