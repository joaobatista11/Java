
package Prova;

import java.util.Scanner;

public class Questao_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p;
        System.out.println("Escreva uma palavra:");
        p = sc.nextLine();
        System.out.println("Quantidade de digitos: "+digitos(p));
    }

    public static int digitos(String p) {
        int c=0;
        for(char l: p.toCharArray()){
        c++;
        }
        
        return c;

    }
}
