package Exercicio_7_Switch_Case;

import java.util.Scanner;

public class Exercicio_1_Calculadora_Simples {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double n1, n2, r = 0;
        int o;
        System.out.println("Digite um numero");
        n1 = tecla.nextDouble();
        System.out.println("Digite outro numero");
        n2 = tecla.nextDouble();
        System.out.println("Digite um numero para escolher a operacao\n1. Adicao\n2. Subtracao\n3. Multiplicacao\n4. Divisao");
        o = tecla.nextInt();
        switch (o) {
            case 1:
                r = n1 + n2;
                System.out.println(r);
                break;
            case 2:
                r = n1 - n2;
                System.out.println(r);
                break;
            case 3:
                r = n1 * n2;
                System.out.println(r);
                break;
            case 4:
                r = n1 / n2;
                System.out.println(r);
                break;
            default:
                System.out.println("Operacao nao encontrada");

        }
    }
}
