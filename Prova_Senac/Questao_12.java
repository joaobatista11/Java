
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Digite o tamanho do array:");
        t=sc.nextInt();
        double[]a= new double[t];
        for (int i = 0; i < t; i++) {
            System.out.println(i+1+". Digite um numero:");
            a[i] = sc.nextInt();
        }        
            System.out.println("Valores maiores que 5: "+valoresmaioresque5(a,t));
    }

    public static HashSet<Double> valoresmaioresque5(double[] a, int t) {
        HashSet<Double> set = new HashSet<>();
        double s=0,m;
        int c=0;
        for (int i = 0; i < t; i++) {
        s+=a[i];    
        }
        m=s/t;
        System.out.println("Soma: "+s+"\nMedia: "+m);
        for (int i = 0; i < t; i++) {
        if(a[i]>5){
        c++;    
        set.add(a[i]);
        }
        }
        set.toArray();        
        return set;
    
    }
}
