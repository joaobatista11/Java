
package Exercicio_9_For_Each_Facil;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2_Converter_em_Maiusculo {
    public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    Scanner tecla = new Scanner(System.in);
    String p;
        System.out.println("Escreva uma palavra");
        p=tecla.nextLine().toUpperCase();
        lista.add(p);
        for (String pala : lista) {
            System.out.println(pala);    
        }
    }
}
