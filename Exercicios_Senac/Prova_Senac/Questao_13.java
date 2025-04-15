
package Prova;

import java.util.Scanner;

public class Questao_13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String p, n;    
    System.out.println("Escreva uma frase");
    p = sc.nextLine();
        for(char l: p.toCharArray()){
    n = p.replace("Java", "Programacao");
        System.out.println("Nova frase:\n"+n);
    }
}
}   