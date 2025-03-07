package Exercicio_4_For;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_10_Jogo_de_Adivinhacao {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int g = new Random().nextInt(100);
        for (int c = 1; c <= 7; c++) {
            
            System.out.println("Tentativa " + c + ". Digite um numero de 1 a 100:");
            int n = tecla.nextInt();
            if(n==g){    
            System.out.println("Voce ganhou!\nAcertou em " + c + " tentativas");
                break;
            } else if (n > g) {
                System.out.println("Menor");
            } else if (n < g) {
                System.out.println("Maior");
            }
            if (n != g && c == 7) {
                System.out.println("Voce perdeu!\nO numero e: " + g);
            }
            }
        }
}



