
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_3_Acessar_Elementos {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        Scanner tecla = new Scanner (System.in);
        double n,t;
        for (int c = 1; c <= 5; c++){
            System.out.println(c+". Digite um numero");        
            n = tecla.nextDouble();
            lista.add(n);
                    }
        t = lista.get(2);
       System.out.println("O terceiro e: "+t);
    }
}
