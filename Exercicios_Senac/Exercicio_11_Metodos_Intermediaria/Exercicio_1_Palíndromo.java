
package Exercicio_11_Metodos_Intermediaria;

import java.util.Scanner;

public class Exercicio_1_Palíndromo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    String p;
    System.out.println("Escreva uma palavra");        
    p=sc.nextLine().toLowerCase();
    palindromo(p);        
    }

    public static boolean palindromo(String p) {
    String r;
    r = new StringBuilder(p).reverse().toString();
    if(r.equals(p)){
        System.out.println("E palindromo");
        return true;
    }else{
        System.out.println("Nao e palindromo");
        return false;
    }
        
    }
}
