package Exercicio_11_Metodos_Intermediaria;

import java.util.Scanner;

public class Exercicio_3_A_Media_de_Aritmeticas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, s = 0;
        double m = 0;
        System.out.println("Quantos numeros voce quer somar?");
        t = sc.nextInt();
        int[] n = new int[t];
        for (int c = 0; c < t; c++) {
            System.out.println((c + 1) + ". Digite um numero");
            n[c] = sc.nextInt();
        }
        soma(n, s, t, m);
    }

    public static double soma(int[] n, int s, int t,double m) {
        for (int r : n) {
            s += r;
        }
        System.out.println("Soma: "+s+"\nMedia:"+media(s,t,m)+"\nTamanho do Array: "+t);
        return s;
    }
    public static double media(int s, int t, double m) {       
        m = s / t;
        return m;
    }
}
