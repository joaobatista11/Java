package exercicios_1_Basico;

import java.util.Scanner;

public class Exercicio_5_Conversor_de_Moedas {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o valor em real");
        double r = tecla.nextDouble();
        double d = r * 5.45;
        System.out.println("Convertido em " + String.format("%.2f", d) + " dolares");

    }

}
