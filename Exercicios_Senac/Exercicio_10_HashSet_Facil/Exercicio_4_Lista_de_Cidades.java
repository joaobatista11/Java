
package Exercicio_10_HashSet_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_4_Lista_de_Cidades {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
for (int i = 1; i <= 5; i++) {
            System.out.println(i+". Escreva um nome de uma cidade");    
                        set.add(tecla.nextLine());        
    }
        set.remove("");
        if(set.isEmpty()==true){
            System.out.println("A lista esta vazia");
        for(String cidades: set){
            System.out.println(cidades);
        }    
        }else{
            System.out.println("A lista esta cheia");
        for(String cidades: set){
            System.out.println(cidades);
        }
        }
    }
}
