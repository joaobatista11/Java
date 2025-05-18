/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Divisivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int n, t;
        System.out.println("Digite um número positivo");
        n = sc.nextInt();
        while (n<=0){
        System.out.println("Número inválido\nDigite um número positivo");
        n = sc.nextInt();
        }
        for (int i = 1; i <=n; i++) {
        if (n%i==0) {
        lista.add(i);
        }    
        }
        t = lista.size();
        System.out.println("\nNúmeros que dividem o "+n+":("+t+")\n");
        for(int num: lista){
            System.out.println(num);
        }
        if(t==2){
            System.out.println("\nÉ um número primo");
        }
        
    }
    
}
