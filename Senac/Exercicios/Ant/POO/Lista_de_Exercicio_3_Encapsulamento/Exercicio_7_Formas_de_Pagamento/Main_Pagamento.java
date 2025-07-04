/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_7_Formas_de_Pagamento;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o;
        double n;
        System.out.println("Forma de pagamento\n1 - Dinheiro\n2 - Boleto\n3 - Cartão de Crédito");
        o = sc.nextInt();
        while(o<1 || o>3){
        System.out.println("Opcão inválida\nForma de pagamento\n1 - Dinheiro\n2 - Boleto\n3 - Cartão de Crédito");
        o = sc.nextInt();        
        }
        System.out.println("Digite o valor:");
        n = sc.nextDouble();
        while(n<=0){
        System.out.println("Valor inválido\nDigite o valor:");
        n = sc.nextDouble();        
        }
        Cartao_Credito cc = new Cartao_Credito();
        Boleto b = new Boleto();
        Dinheiro d = new Dinheiro();
        switch(o){
            case 1 -> {System.out.println("Dinheiro: R$"+d.efetuar_pagamento(n));}
            case 2 -> {System.out.println("Boleto: R$"+b.efetuar_pagamento(n));}
            case 3 -> {System.out.println("Cartão de Crédito: R$"+cc.efetuar_pagamento(n));}
        }
    }
}
