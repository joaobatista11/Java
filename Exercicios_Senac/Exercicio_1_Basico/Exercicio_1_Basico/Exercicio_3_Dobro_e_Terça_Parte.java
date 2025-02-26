/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_1_Basico;

import java.util.Scanner;

public class Exercicio_3_Dobro_e_Terça_Parte {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero");
        double n1 = teclado.nextDouble();
        double r1 = (n1 * 2);
        double r2 = r1 / 3;
        System.out.println("o dobro e: " + String.format("%.4f", r1) + " e a terca parte e: " + String.format("%.4f", r2));

    }

}
