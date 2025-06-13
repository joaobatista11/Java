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
public class Exercicio_5_Entre_10_e_20 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o numero");
        int n = tecla.nextInt();
        if(n>=10 && n<=20){
            System.out.println("O numero "+n+" esta entre 10 a 20");
        }else{
            System.out.println("O numero "+n+" nao esta entre 10 a 20");

        }
    }
    
}
