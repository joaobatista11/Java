
package Exercicio_7_Switch_Case;

import java.util.Scanner;

public class Exercicio_4_Menu_de_Bebidas {
    public static void main(String[] args) {
    Scanner tecla = new Scanner(System.in);
        int o;
        System.out.println("Menu de bebidas\n\n1. Refrigerante\n2. Suco\n3. Agua\n\nDigite um numero para selecionar a opcao");
        o = tecla.nextInt();
        switch (o){
            case 1:
                System.out.println("Refrigerante selecionado");
                break;
            case 2:
                System.out.println("Suco selecionado");
                break;
            case 3:
                System.out.println("Agua selecionado");
                break;
            default:
                System.out.println("Selecao invalida");
                break;
        }
    }    
}
