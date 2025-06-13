
package Exercicio_9_For_Each_Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1_Lista_de_Pares {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        int n,c=0;
        for (int i = 1; i <=5; i++) {
            System.out.println((i) + ". Digite um numero");
            n = tecla.nextInt();           
            if(n%2==0){
            lista.add(n);
            c++;
            
        }
        
    }
        System.out.println("\nNumeros sem impares\n");
        for(int num: lista){
        System.out.println(num);
        }
        System.out.println("numeros pares: "+c);
}
}