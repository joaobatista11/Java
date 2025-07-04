/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2_Aritmeticas_Operadores_Relacionais_e_Logicos;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Exercicio_4_Hipotenusa {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o primeiro cateto");
        double n1 = tecla.nextDouble();
        System.out.println("Digite o segundo cateto");
        double n2 = tecla.nextDouble();
        double s = Math.sqrt(Math.pow(n1, 2)+Math.pow(n2, 2));
        System.out.println("o resultado da hipotenusa e: "+s);
    
    }
}
