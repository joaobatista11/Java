package Exercicio_8_Arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exercicio_7_Ordenar_Elementos {
    public static void main(String[] args) {
         ArrayList<Integer> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        int n;
        for (int c = 1; c <= 10; c++){

            System.out.println(c + ". Digite um numero");
            n = tecla.nextInt();
            lista.add(n);
                    }
    Collections.sort(lista);                
        for (Integer contador : lista) {
                        System.out.println(contador);
            }
        
    }
}
