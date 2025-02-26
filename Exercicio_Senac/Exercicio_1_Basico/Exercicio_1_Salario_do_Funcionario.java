package exercicios_1_Basico;

import java.util.Scanner;

public class Exercicio_1_Salario_do_Funcionario {

    public static void main(String[] args) {

        Scanner teclacar = new Scanner(System.in);
        Scanner teclanum = new Scanner(System.in);

        System.out.println("Qual o nome do funcionario?");
        String n = teclacar.nextLine();
        System.out.println("Qual o salario do funcionario?");
        float s = teclanum.nextFloat();
        System.out.println("Funcionario: " + n + "\nSalario: " + s);

    }
}
