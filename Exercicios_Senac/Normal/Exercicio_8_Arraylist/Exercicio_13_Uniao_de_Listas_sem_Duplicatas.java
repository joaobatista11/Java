
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_13_Uniao_de_Listas_sem_Duplicatas {
public static void main(String[] args) {
 ArrayList<Integer> lista = new ArrayList<>();
 ArrayList<Integer> lista2 = new ArrayList<>();
 ArrayList<Integer> uniao = new ArrayList<>();
 Scanner tecla = new Scanner(System.in);
 int n;
         System.out.println("Primeiro lista de numeros\n");        

 for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Digite um numero");
            n = tecla.nextInt();
            lista.add(n);

        }
          System.out.println("\nSegunda lista de numeros\n");        

 for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Digite um numero");
            n = tecla.nextInt();
            lista.add(n);

        }
   for (Integer comp : lista) {
            if(!uniao.contains(comp)){
            uniao.add(comp);                           
            }
}
    System.out.println("\nLista sem duplicatas\n");   
for (Integer num : uniao) {
            System.out.println(num);      
}
}
}