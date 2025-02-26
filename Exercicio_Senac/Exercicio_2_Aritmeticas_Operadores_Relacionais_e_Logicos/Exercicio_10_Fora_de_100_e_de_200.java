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
public class Exercicio_10_Fora_de_100_e_de_200 {
public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o valor");
        int n = tecla.nextInt();
        boolean a = (n>=100 && n<=200);
        if(a==true){
            System.out.println("O valor "+n+" esta dentro do intervalo de 100 a 200");
        }else{
            System.out.println("O valor "+n+" esta fora do intervalo de 100 a 200");

        }
    }
    
}

