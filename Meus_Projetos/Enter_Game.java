/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Enter_Game {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);    
        String n;
        int i=0, p=10, u=1;
        System.out.println("Chegue a 1000000000 pontos");
        while(i<=1000000000){
            //Thread.sleep(250);
            if(i>=p){
            System.out.println("Voce tem "+i+" pontos\nGanha "+u+" pontos por enter\nUpgrade de +1 ponto por cada enter\npreco: "+p+" pontos\nComprar? Escreva sim para comprar");
            n = sc.nextLine().toLowerCase();
            if("sim".equals(n)){
                i-=p;
                u+=1;
                p+=p/2;
                System.out.println("Proximo upgrade custa "+p+" pontos");
            }else{
            i+=u;
            }
            }else{
            System.out.println("Voce tem "+i+" pontos. Aperte enter para ganhar "+u+" pontos");
            n = sc.nextLine().toLowerCase();
            i+=u;
            }
        }
    }
   
}
