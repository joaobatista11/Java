
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_11_Remover_Duplicatas {
public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        int n;
        System.out.println("Digite 10 numeros inteiros");
        for (int c = 1; c <= 10; c++){

            System.out.println(c + ". Digite um numero");
            n = tecla.nextInt();
        if(!lista.contains(n)){
            lista.add(n);
        }            
        }
    System.out.println("\nLista de numeros sem duplicatas\n");
        for (Integer num : lista) {
                        System.out.println(num);
            }
}
}