package Exercicio_5_While;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_5_Jogo_de_Par_ou_Impar {

    public static void main(String[] args) {

        Scanner teclanum = new Scanner(System.in);
        Scanner teclacar = new Scanner(System.in);
        Scanner teclastring = new Scanner(System.in);

        int g = new Random().nextInt(5), n, s;

        System.out.println("Quer jogar par ou impar? [s]/[n]");
        char a = teclacar.next().toLowerCase().charAt(0);
        while (a == 's') {

            System.out.println("Par ou impar?");
            String p = teclastring.nextLine().toLowerCase();

            while (!"par".equalsIgnoreCase(p) || !"impar".equalsIgnoreCase(p)) {
                System.out.println("Escolha invalida!");
                System.out.println("Par ou impar?");
                p = teclastring.nextLine().toLowerCase();
            }

            System.out.println("Digite o numero de 0 a 5");
            n = teclanum.nextInt();

            while (n > 5 || n < 0) {
                System.out.println("Numero invalido!");
                System.out.println("Digite o numero de 0 a 5");
                n = teclanum.nextInt();
            }

            s = n + g;
            System.out.println("Voce : " + n + "\nA maquina: " + g + "\nA soma:" + s);

            if (s % 2 == 0 && "par".equals(p)) {
                System.out.println("Voce ganhou");
            } else if (s % 2 == 0 && "impar".equals(p)) {
                System.out.println("Voce perdeu");
            }
            if (s % 2 == 1 && "impar".equals(p)) {
                System.out.println("Voce ganhou");
            } else if (s % 2 == 1 && "par".equals(p)) {
                System.out.println("Voce perdeu");
            }

            System.out.println("Quer jogar par ou impar? [s]/[n]");
            a = teclacar.next().toLowerCase().charAt(0);
        }
    }
}
