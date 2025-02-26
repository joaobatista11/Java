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
public class Exercicio_3_Pode_Dirigir {
    public static void main(String[] args) {
        Scanner teclanum = new Scanner(System.in);
        Scanner teclacar = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String p = teclacar.nextLine();
        
        System.out.println("Digite o ano que voce nasceu:");
        int n = teclanum.nextInt();
        
        int i = 2025-n;
        System.out.println(p+". Voce tem "+i+" anos");
        boolean d = (i>18);
       
        if(d != true){
        System.out.println("Voce nao pode dirigir");
        
        }else{
        System.out.println("Voce tem CNH?\nDigite o numero 1 se sim");
        int g = teclanum.nextInt();
        boolean c = (g==1);
        if (c==true){
            System.out.println(p+". Voce pode dirigir");
        
        } else {
            System.out.println(p+". Voce nao pode dirigir");
        }
        }
        
    }
    
}
