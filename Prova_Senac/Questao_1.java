
package Prova;

import java.util.Scanner;

public class Questao_1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,t,s=0;
        System.out.println("Quantos numeros quer digitar?");
        t=sc.nextInt();
        
        while(t<=1){
        System.out.println("Numero invalido\nQuantos numeros quer digitar?");
        t=sc.nextInt();
        }
        int[]a=new int[t];
        
        for (int i = 0; i <t; i++) {
            System.out.println((i+1)+". Digite um numero:");
            a[i]=sc.nextInt();
            s+=a[i];
        }
        System.out.println("Soma: "+s+"\nMedia: "+media(s,t));
        System.out.print("Numeros maiores que a media: ");    
        for (int i = 0; i < t; i++) {
        if (a[i]>media(s,t)) {
            System.out.println(a[i]);
        }    
        }
    }

    public static double media(int s, int t) {
        double m, td=t, sd=s;
        m=sd/td;
        
        return m;
    
    }
}
