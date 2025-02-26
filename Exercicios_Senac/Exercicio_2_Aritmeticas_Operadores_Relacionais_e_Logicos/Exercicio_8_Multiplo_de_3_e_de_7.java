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
public class Exercicio_8_Multiplo_de_3_e_de_7 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o numero");
        int n = tecla.nextInt();
        boolean a = ((n % 3 == 0) && (n% 7 ==0));
        if(a==true){
            System.out.println("O numero "+n+" e multiplo de 3 e de 7");
        }else{
            System.out.println("O numero "+n+" nao e multiplo de 3 e de 7");        
        }

    }
    
}
