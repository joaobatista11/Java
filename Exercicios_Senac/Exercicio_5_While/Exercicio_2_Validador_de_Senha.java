package Exercicio_5_While;

import java.util.Scanner;

public class Exercicio_2_Validador_de_Senha {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int s = 1234;
        System.out.println("Digite a senha");
        int n = tecla.nextInt();
        while (n != s) {
            System.out.println("Senha invalida");
            System.out.println("Digite a senha");
            n = tecla.nextInt();

        }
        System.out.println("Senha correta");
    }
}
