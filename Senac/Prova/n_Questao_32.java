
package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class n_Questao_32 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t, n;
        System.out.println("Qual o tamanho?");
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(i+1 + ". Digite um numero");
            n = sc.nextInt();
            lista.add(n);
            if(!lista.contains(n)){
            lista.remove(n);
        } 
        }
        lista.toArray();
        System.out.println("Numeros que foram repetidos: "+lista);
    }
}
