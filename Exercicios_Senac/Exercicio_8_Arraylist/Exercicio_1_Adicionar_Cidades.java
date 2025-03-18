package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1_Adicionar_Cidades {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        String n;
        for (int c = 1; c <= 5; c++) {
            System.out.println("Escreva o nome da cidade " + c);
            n = tecla.nextLine();
            lista.add(n);
        }
         for (String cidades : lista) {
                System.out.println("Cidades\n\n"+cidades);
            }
    }
}
