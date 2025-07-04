
package Exercicio_6_Do_While;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_5_Jogo_de_Adivinhação {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int g = new Random().nextInt(100), n, c = 0;
        do{
            c++;
            System.out.println("Tentativa " + c + ". Digite um numero de 1 a 100:");
            n = tecla.nextInt();
            
            if (n > g) {
                System.out.println("Menor");
            } else if (n < g) {
                System.out.println("Maior");
            }
            }while(n!=g);
            System.out.println("Voce ganhou!\nAcertou em " + c + " tentativas");        
        }
}
