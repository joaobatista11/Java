package exercicios_1_Basico;

import java.util.Scanner;

public class Exercicio_6_Pintando_a_Parede {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a altura da parede");
        double a = tecla.nextDouble();
        System.out.println("Digite a largura da parede");
        double l = tecla.nextDouble();
        double m = (l * a) / 2;
        System.out.println("Voce vai precisar de " + m + " litros de tinta");

    }

}
