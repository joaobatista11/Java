
package Exercicio_9_For_Each_Intermediario;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_1_Contador_de_maior_que_10 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<>();
        
        int n1,c=0;
        for (int i = 1; i <=5; i++) {
            System.out.println((i) + ". Digite um numero");
            int[] n2 = new int [tecla.nextInt()];           
            if(n2.length>10){
            set.add(n2.length);
            c++;
            }
        }
        System.out.println("\nNumeros maiores que 10\n");
        for(int lista: set){
        System.out.println(lista);
        }
        System.out.println("\nContador de numeros maior que 10: "+c);
}
}