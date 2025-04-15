
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args) {
        Scanner teclanum = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        Scanner teclacar = new Scanner(System.in);
        int n;
        String p;
        do{
        System.out.println("\nMenu de opcoes\n\n1-Cadastrar\n2-Listar\n3-Sair");
        n = teclanum.nextInt();
        switch(n){
            case 1 -> {
                System.out.println("Cadastro\n\nEscreva o seu nome");
                p = teclacar.nextLine();
                set.add(p);
                System.out.println("\n"+p+" foi cadastrado");
                break;
            }
            case 2 ->{
                System.out.println("\nLista\n");
                for(String lista: set){
                System.out.println(lista);
                }
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
