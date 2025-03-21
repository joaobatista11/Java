
package Exercicio_9_For_Each_Facil;

import java.util.Scanner;

public class Exercicio_1_Soma_de_Array {
    public static void main(String[] args) {    
    Scanner tecla = new Scanner(System.in);
    int t, s=0;
        System.out.println("Quantos numeros voce quer somar?");
        t = tecla.nextInt();            
    int [] n = new int [t];                
    for(int c=0; c<t;c++){    
    System.out.println((c+1)+". Digite um numero");
        n[c] = tecla.nextInt();            
    }
    for(int r: n){
        s+=r;   
    }
        System.out.println(s);
    }
}
