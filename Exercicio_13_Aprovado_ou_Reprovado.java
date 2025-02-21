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
public class Exercicio_13_Aprovado_ou_Reprovado {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o nome do(a) aluno(a)");
        String a = tecla.nextLine();
        System.out.println("Digite a primeira nota do(a) aluno(a):");
        double n1 = tecla.nextDouble();
        System.out.println("Digite a segunda nota do(a) aluno(a):");
        double n2 = tecla.nextDouble();
        double m = (n1 + n2) / 2;
        System.out.println("A media da nota de " + a + " e: " + m);

        if (m >= 7) {
            System.out.println("Esta APROVADO");
        } else if (m >= 5 && m < 7) {
            System.out.println("Esta em RECUPERACAO");
        } else if (m < 5) {
            System.out.println("Esta REPROVADO");
            } 
                }
    }

