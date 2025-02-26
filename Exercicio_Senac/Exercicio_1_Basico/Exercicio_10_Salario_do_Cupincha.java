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
public class Exercicio_10_Salario_do_Cupincha {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite os dias que o cupincha trabalhou:");
        int d = tecla.nextInt();
        double s = (d * 8) * 25;
        System.out.println("O salario do cupincha: R$" + String.format("%.2f", s));
    }

}
