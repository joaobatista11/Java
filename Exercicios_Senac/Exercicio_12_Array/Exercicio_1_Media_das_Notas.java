
package Exercicio_12_Array;

import java.util.Scanner;

public class Exercicio_1_Media_das_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        double m, s=0;
        System.out.println("Quantas notas");
        t = sc.nextInt();
        double[] n = new double[t];
        for (int i = 0; i < t; i++) {
            System.out.println("Digite a nota do(a) aluno(a) "+(i + 1)+":");
            n[i] = sc.nextDouble();
        }
        for(double r: n){
        s+=r;   
    }
        m=s/t;
        System.out.println("Notas: "+t+"\nSoma: "+s+"\nMedia: "+m);
    }
        }
