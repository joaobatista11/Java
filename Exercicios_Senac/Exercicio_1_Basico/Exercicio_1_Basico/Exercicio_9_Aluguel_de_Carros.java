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
public class Exercicio_9_Aluguel_de_Carros {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite os dias que alugou do carro:");
        int d = tecla.nextInt();
        System.out.println("Digite os quilometros percorridos do carro alugado");
        int km = tecla.nextInt();
        int dv = d * 90;
        double kmv = d * 0.20;
        double v = dv + kmv;
        System.out.println("Voce alugou por " + d + ". O valor deu R$" + dv);
        System.out.println("Voce percorreu por" + km + " kms. O valor deu R$" + kmv);
        System.out.println("Total: R$" + String.format("%.2f", v));
    }

}
