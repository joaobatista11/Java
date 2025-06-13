
package Exercicio_12_Array;

import java.util.Arrays;
import static java.util.Arrays.sort;
import java.util.Scanner;

public class Exercicio_9_Ordem_de_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tecla = new Scanner(System.in);        
        int t;
        System.out.println("Quantos elementos voce quer?");
        t = sc.nextInt();
        String[] a = new String[t];
        for (int i = 0; i < t; i++) {
            System.out.println((i+1)+". Escreva uma palavra:");
            a[i] = tecla.nextLine().toLowerCase();
        }
        sort(a);
        System.out.println("\nLista em crescente\n"+Arrays.toString(a));
        }
}
