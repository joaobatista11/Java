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
public class Exercicio_4_Conversor_de_Medidas {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o valor em metros");
        double m = tecla.nextDouble();
        double cm = m * 100;
        double km = m / 1000;
        System.out.println("O " + m + " metros \nConvertido em " + cm + " centimetros \nConvertido em " + km + " kilometros");

    }

}
