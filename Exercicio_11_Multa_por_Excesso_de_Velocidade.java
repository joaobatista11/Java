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
public class Exercicio_11_Multa_por_Excesso_de_Velocidade {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Qual a velocidade do carro?");
        int v = tecla.nextInt();
        if (v > 80) {
            double m = (v - 80) * 5;
            System.out.println("Valor da multa: R$" + String.format("%.2f", m));
        } else {
            System.out.println("O motorista nao excedeu o limite de velocidade");
        }
    }

}
