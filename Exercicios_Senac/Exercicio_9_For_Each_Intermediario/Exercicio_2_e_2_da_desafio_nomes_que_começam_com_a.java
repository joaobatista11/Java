package Exercicio_9_For_Each_Intermediario;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2_nomes_que_começam_com_a {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        String p;
        int c = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ".Escreva um nome");
            p = tecla.nextLine();
            if (p.startsWith("A")||p.startsWith("a")) {
            c++;            
                lista.add(p);
            }
        }

        System.out.println("\nNomes que comecam com a letra A\n");
        for (String nomes : lista) {
            System.out.println(nomes);
        }
            System.out.println("\nPossui " +c+ " nomes que comecam com a letra A");
        
    }
}
