
package Exercicio_12_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_4_Filtrando_Pares {
    public static void main(String[] args) {
ArrayList<Integer> lista = new ArrayList<>();   
        Scanner sc = new Scanner(System.in);
        int t,n;
        System.out.println("Quantos elementos quer colocar?");
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println((i + 1)+". Digite um numero ");
            n = sc.nextInt();            
            if (n%2==0){
            lista.add(n);
            }
            }
        lista.toArray();
        System.out.println("Numeros Pares\n"+lista);      
    }
}
