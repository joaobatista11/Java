
package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 ArrayList<String> lista = new ArrayList<>();
        String p, m = null;
        int c=0;
        do{
            System.out.println("Escreva uma frase");    
            p = sc.nextLine().toLowerCase();
            if(!(p.equalsIgnoreCase("sair"))){
            lista.add(p);
            c++;
            }
        }while(!(p.equalsIgnoreCase("sair")));
        Collections.sort(lista);
        if(c!=0){
        m = lista.get(c-1);
        }
        if(m==null){
        System.out.println("Voce nao digitou nada");
        }else{
        System.out.println("A maior frase: "+m);        
        }
    }
}
