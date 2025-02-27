package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_1_Dia_da_Mulher {

    public static void main(String[] args) {
        Scanner teclanum = new Scanner(System.in);
        Scanner teclacar = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String n = teclacar.nextLine();
        System.out.println("Qual o seu sexo?[m/f]");
        String mf = teclacar.nextLine();
        System.out.println("Qual o valor do produto?");
        double p = teclanum.nextDouble();
        if ("m".equals(mf)) {
            double m = p * 0.95;
            System.out.println(n + ". O valor deu " + m);
        } else if ("f".equals(mf)) {
            double f = p * 0.87;
            System.out.println(n + ". O valor deu " + f);
        }
    }
}
