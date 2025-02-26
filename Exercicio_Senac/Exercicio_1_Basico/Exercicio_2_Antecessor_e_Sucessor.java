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
public class Exercicio_2_Antecessor_e_Sucessor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int n1 = teclado.nextInt();
        System.out.println("O antessor e: " + (n1 - 1) + "\nO sucessor e: " + (n1 + 1));

    }
}
