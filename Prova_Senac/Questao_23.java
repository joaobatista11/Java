
package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Questao_23 {
    public static void main(String[] args) {
         ArrayList<Double> lista = new ArrayList<>();
         HashSet<Double> set = new HashSet<>(lista);
         double n;
         Scanner sc = new Scanner(System.in);
         for (int i = 1; i <=8; i++) {
            System.out.println(i+". Digite um valor");
            n = sc.nextDouble();
            if(!lista.contains(n)){
            lista.add(n);
        }            
        }
         Collections.sort (lista);
         double segundo = lista.get(6);
         System.out.println(segundo);
    }
}
