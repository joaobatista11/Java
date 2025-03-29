
package Exercicio_11_Metodos_Intermediaria;

import java.util.Scanner;

public class Exercicio_4_Expoenciacao {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int b,e;
    System.out.println("Digite uma base");
    b = sc.nextInt();
    System.out.println("Digite um expoente");
    e = sc.nextInt();    
    expoente(b,e);    
    }

    public static int expoente(int b,int e) {
        int m=1;
        for (int i = 1; i <=e; i++) {
        m*=b;    
        }
        System.out.println(m);
        return 0;

    }
}
