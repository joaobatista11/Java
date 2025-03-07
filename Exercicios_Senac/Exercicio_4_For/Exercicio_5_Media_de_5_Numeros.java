
package Exercicio_4_For;

import java.util.Scanner;

public class Exercicio_5_Media_de_5_Numeros {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int s = 0;
        for(int i = 1; i<=5; i++){        
        System.out.println("Digite um valor");
        double v = tecla.nextInt();
        s += v;
    }
        double m=s/5;
        System.out.println("A soma dos valores e: "+s+"\nA media e: "+m);
    }
}
