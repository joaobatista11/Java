
package com.mycompany.projeto;

import java.util.ArrayList;

public class Contador_com_Arraylist {
public static void main(String[] args) {
                ArrayList<Integer> lista = new ArrayList<>();
                
                for (int c = 1; c <= 10; c++){
                    lista.add(c);
                    }
        
                    for (Integer contador : lista) {
                System.out.println(contador);
            }
                    
    }
}
/*
ArrayList<Integer> lista = new ArrayList<>();
         ArrayList<Integer> lista2 = lista;
lista2.sort((Comparator<? super Integer>) lista);
*/
