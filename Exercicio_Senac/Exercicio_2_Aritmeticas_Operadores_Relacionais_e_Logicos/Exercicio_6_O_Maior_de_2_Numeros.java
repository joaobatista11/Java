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
public class Exercicio_6_O_Maior_de_2_Numeros {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double n1 = tecla.nextDouble();
        System.out.println("Digite o segundo numero");
        double n2 = tecla.nextDouble();    
    boolean a = (n1>n2);
   if (a==true){
        System.out.println("O numero "+n1+" e maior que "+n2);
    }else if (n1==n2){
    System.out.println("Os numeros sao iguais");
    }else{
        System.out.println("O numero "+n2+" e maior que "+n1);    
    }
    }
   
}
