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
public class Exercicio_2_Ano_Bissexto {
    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        System.out.println("Digite o ano");
        int a = tecla.nextInt();
        boolean b = ((a % 4 == 0) || (a%400==0) && (a%100!=0) );

        if(b==true){
        System.out.println("O ano e bissexto");                
        }else{
        System.out.println("O ano nao e bissexto");                

        }
    }
    
    
}
