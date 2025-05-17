
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_15_Reverter_Lista {
    public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    Scanner tecla = new Scanner(System.in);    
    String temp;
    for (int c = 1; c <= 6; c++) {
            System.out.println(c+". Escreva uma palavra");
            lista.add(tecla.nextLine());
        }
    
    int tam=lista.size();
     for (int c = 0; c < tam/2; c++) {   
     temp=lista.get(c);
     lista.set(c, lista.get(tam -1 -c));
     lista.set(tam -1 -c, temp);
     }
     for (String carac : lista) {
            System.out.println(carac);
        } 
    }
}
