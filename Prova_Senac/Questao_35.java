
package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao_35 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
 ArrayList<String> lista = new ArrayList<>();
        String p;
        do{
            System.out.println("Digite um nome");    
            p = sc.nextLine().toLowerCase();
            if(!(p.equalsIgnoreCase("fim"))){
            lista.add(p);
            }
        }while(!(p.equalsIgnoreCase("fim")));
        System.out.println("Lista de nomes");
        for(String r: lista){
            System.out.println(r);
        }
    }
}
