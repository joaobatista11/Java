/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_2_Animal;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Animal {
    public static void main(String[] args) {
    Animal c = new Cachorro();
    Animal g = new Gato();
    Animal p = new Passaro();
    Scanner sc = new Scanner(System.in);
    int o;
    
    do{
        System.out.println("\nSistema EMITIR SOM\nEscolha as opções abaixo\n1 - Cachorro;\n2 - Gato;\n3 - Passáro;\n4 - Sair\n");
        o = sc.nextInt();
        System.out.println("");
        switch(o){
            case 1 ->{c.emitir_som();}
            case 2 ->{g.emitir_som();}
            case 3 ->{p.emitir_som();}
            case 4 ->{System.out.println("Fechando o sistema");;}
            default ->{System.out.println("Opção inválida");}
        }
    }while(o!=4);
    
    }
    
}
