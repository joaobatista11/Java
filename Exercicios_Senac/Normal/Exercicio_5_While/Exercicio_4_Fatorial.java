package Exercicio_5_While;

import java.util.Scanner;

public class Exercicio_4_Fatorial {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int c = 1;
        long f = 1;
        System.out.println("Digite um numero");
        int n = tecla.nextInt();
        while (n < 1) {
            System.out.println("Numero ivalido");
            System.out.println("Digite um numero");
            n = tecla.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("O fatorial de " + n + " e " + f);
    }
}
