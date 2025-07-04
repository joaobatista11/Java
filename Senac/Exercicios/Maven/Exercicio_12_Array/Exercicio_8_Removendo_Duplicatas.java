
package Exercicio_12_Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_8_Removendo_Duplicatas {
    public static void main(String[] args) {
HashSet<Integer> lista = new HashSet<>();   
        Scanner sc = new Scanner(System.in);
        int t,n;
        System.out.println("Quantos elementos quer colocar?");
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println((i + 1)+". Digite um numero ");
            n = sc.nextInt();
            lista.add(n);
            }
            
        lista.toArray();
        System.out.println("Numeros sem duplicatas\n"+lista);      
    }
}
