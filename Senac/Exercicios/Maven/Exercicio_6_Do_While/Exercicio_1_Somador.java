package Exercicio_6_Do_While;

import java.util.Scanner;


public class Exercicio_1_Somador {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int n, s=0;
        do{ 
        System.out.println("Digite um numero");
         n = tecla.nextInt();
         s+=n;
        if(s!=n){ 
            System.out.println(s);
        }
        }while(n!=0);
        System.out.println("Total: "+s);
    }
}
