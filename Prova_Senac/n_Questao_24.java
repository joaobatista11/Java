
package Prova;

import java.util.Scanner;

public class n_Questao_24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String p,n;    
    System.out.println("Escreva uma frase");
    p = sc.nextLine();
    n = p.replace("[aeiouAEIOU]", "*");
        System.out.println("Nova frase:\n"+n);
    }
}        
