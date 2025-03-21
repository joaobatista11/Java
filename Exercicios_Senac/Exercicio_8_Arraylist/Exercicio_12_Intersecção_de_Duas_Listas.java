
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio_12_Intersecção_de_Duas_Listas {
    public static void main(String[] args) {
 ArrayList<String> lista = new ArrayList<>();
 ArrayList<String> lista2 = new ArrayList<>();
 ArrayList<String> interseccao = new ArrayList<>();
 Scanner tecla = new Scanner(System.in);
        String n;
        System.out.println("Primeiro lista de nomes");        
        for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Escreva um nome");
            n = tecla.nextLine();
            lista.add(n);

        }
        System.out.println("Segunda lista de nomes");        
        for (int c = 1; c <= 5; c++){
               System.out.println(c + ". Escreva um nome");
            n = tecla.nextLine();
           // lista2.add(n2);
if(!lista2.contains(lista)){
            lista2.add(n);
        }     
        }
   //            System.out.println(lista);
 //                       System.out.println(lista2);
//            System.out.println(lista3);            
        for (String comp : lista) {
            if(lista2.contains(comp)){
            interseccao.add(comp);                           
            
            }
//        for (String nome2 : interseccao) {                          
//                        System.out.println(nome2);
//            
//            } 
    }
System.out.println(interseccao);        
    }
}
/*
ArrayList<Integer> lista = new ArrayList<>();
         ArrayList<Integer> lista2 = lista;
lista2.sort((Comparator<? super Integer>) lista);
*/

