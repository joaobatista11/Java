package Exercicio_9_For_Each_Facil;

import java.util.Scanner;

public class Exercicio_3_Maior_numero {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        //int p=Integer.MIN_VALUE, g=Integer.MAX_VALUE;
        int n1=0, g1, p1;
        System.out.println("Digite 5 numeros");
            System.out.println((1) + ". Digite um numero");
            n1 = tecla.nextInt();
        g1 = n1;
        p1 = n1;
        for (int i = 2; i < 5; i++) {
            System.out.println((i) + ". Digite um numero");
            n1 = tecla.nextInt();
            int[] n2 = new int[n1];
            if (n1 > g1) {
                g1 = n1;
            }
            if (n1 < p1) {
                p1 = n1;
            }
        }
        System.out.println("Maior numero: " + g1 + "\nMenor numero: " + p1);

    }
}
