
package Exercicio_11_Metodos_Facil;

import java.util.Scanner;

public class Exercicio_3_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long f=1;
        System.out.println("Digite um numero");
        n = sc.nextInt();
        System.out.println(pos(n,f));
    }

    public static double fat(int n,long f) {
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }    

    public static long pos(int n,long f) {
        Scanner sc = new Scanner(System.in);
        while(n<0){
            System.out.println("Numero invalido\nDigite um numero");
            n = sc.nextInt();
        }
        return (long) fat(n,f);
    }
    }

