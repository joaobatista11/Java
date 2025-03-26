
package Exercicio_11_Metodo_Facil;

import java.util.Scanner;

public class Exercicio_3_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero");
        n = sc.nextInt();
        fat(n);
    }

    private static double fat(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
        return 0;
    }    
    }

