package Exercicio_4_For;

import java.util.Scanner;

public class Exercicio_9_Qual_o_Maior_e_o_Menor {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        double n = tecla.nextDouble();
        double g = n;
        double p = n;
        for (int c = 2; c <= 7; c++) {
            System.out.println("Digite o numero " + c + ":");
            n = tecla.nextDouble();
            if (n > g) {
                g = n;
            }
            if (n < p) {
                p = n;
            }
        }
        System.out.println("O maior numero e " + g + "\nO menor numero e " + p);
    }
}
