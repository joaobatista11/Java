
package Exercicio_6_Do_While;

import java.util.Scanner;

public class Exercicio_4_Menu_de_Opções {
    public static void main(String[] args) {
        Scanner teclanum = new Scanner(System.in);
        Scanner teclacar = new Scanner(System.in);
        int n;
        String p;
        do{
        System.out.println("\nMenu de opções\n\n1-Cadastrar\n2-Consultar\n3-Sair");
        n = teclanum.nextInt();
        switch(n){
            case 1 -> {
                System.out.println("Cadastro\n\nEscreva o seu nome");
                p = teclacar.nextLine();
                System.out.println(p+" foi cadastrado");
                break;
            }
            case 2 ->{
                System.out.println("Consulta\n\nVoce pode cadastrar ou sair");
                break;
            }
            case 3 ->{
                System.out.println("Voce saiu");
            }
            default ->{
                System.out.println("Numero invalido");
                }
            }        
        }while(n!=3);
        }
}
