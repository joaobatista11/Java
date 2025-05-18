/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_1.Exercicio_9_Produto;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Produto {
    public static void main(String[] args) {
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_double = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        Produto n = new Produto();
        
        System.out.println("Escreva o nome do produto:");
        n.nome = sc_string.nextLine();
        
        System.out.println("Digite o preço do produto "+n.nome+":");
        n.preco = sc_double.nextDouble();
        
        while(n.preco < 0){
        System.out.println("Preço inválido\nDigite o preço do produto "+n.nome+":");
        n.preco = sc_double.nextDouble();        
        }
        
        System.out.println("Digite a quantidade do estoque do produto "+n.nome+":");
        n.quantidade_em_estoque = sc_int.nextInt();
        
        while(n.quantidade_em_estoque < 0){
        System.out.println("Número inválido\nDigite a quantidade do estoque do produto "+n.nome+":");
        n.quantidade_em_estoque = sc_int.nextInt();        
        }
        
        System.out.println("Quantos vendeu o produto "+n.nome+"?");
        n.vendido = sc_int.nextInt();
        
        while(n.vendido > n.quantidade_em_estoque){
        System.out.println("Número inválido\nQuantos vendeu o produto "+n.nome+"?");
        n.vendido = sc_int.nextInt();
        }
        
        System.out.println("\n## Informação do produto ##\n\nNome: "+n.nome+"\nPreço: "+n.preco
                +"\nVendido: "+n.vendido+"\nLucro: "+n.vender()+"\nEstoque atual: "+n.quantidade_em_estoque);
        
        System.out.println("Quanto vai repositar o produto "+n.nome+"?");
        n.repor = sc_int.nextInt();
        
        while(n.repor < 0){
        System.out.println("Número inválido\nQuanto vai repositar o produto "+n.nome+"?");
        n.repor = sc_int.nextInt();            
        }
        
        System.out.println("\n## Estoque atual ##\n\nNome: "+n.nome+"\nEstoque: "+n.repor_estoque());
    }
    
}
