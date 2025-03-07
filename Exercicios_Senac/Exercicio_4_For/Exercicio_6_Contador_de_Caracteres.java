
package Exercicio_4_For;

import java.util.Scanner;

public class Exercicio_6_Contador_de_Caracteres {
    public static void main(String[] args) {
        Scanner teclanum = new Scanner(System.in);
        Scanner teclacar = new Scanner (System.in);
        System.out.println("Digite um numero");
        int n = teclanum.nextInt();
        System.out.println("Digite um caractere");
        char a = teclacar.next().charAt(0);
        for (int c = 1; c <= n; c++){
            System.out.print(a);
        }
    }
}
