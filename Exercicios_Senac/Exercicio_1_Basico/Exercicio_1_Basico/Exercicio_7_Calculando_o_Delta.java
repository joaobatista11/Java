/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_1_Basico;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Exercicio_7_Calculando_o_Delta {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de A ");
        double a = teclado.nextDouble();
        System.out.print("Digite o valor de B ");
        double b = teclado.nextDouble();
        System.out.print("Digite o valor de C ");
        double c = teclado.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.print("O delta e: " + delta);
    }
}
