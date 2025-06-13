
package Exercicio_10_HashSet_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_3_Limpar_Conjunto {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        char a;
        
for (int i = 1; i <= 5; i++) {
            System.out.println(i+". Digite um numero");    
                        set.add(tecla.nextInt());        
    }
        System.out.println("Limpar conjunto?[s/n]");
        a = tecla.next().charAt(0);
        if(a=='s'||a=='S'){
        set.clear();
        }
        if(set.isEmpty()==true){
            System.out.println("A lista esta vazia");
        for(int num: set){
            System.out.println(num);
        }    
        }else{
            System.out.println("A lista esta cheia");
        for(int num: set){
            System.out.println(num);
        }
        }
    }
}