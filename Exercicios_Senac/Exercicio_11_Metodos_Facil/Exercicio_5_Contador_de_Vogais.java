
package Exercicio_11_Metodos_Facil;

import java.util.Scanner;

public class Exercicio_5_Contador_de_Vogais {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    String p;
    System.out.println("Escreva uma palavra");        
    p=sc.nextLine().toLowerCase();
    contador_de_vogais(p);
    }

    public static int contador_de_vogais(String p) {
        int cv=0;
    for(char l: p.toCharArray()){
            if(l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
        cv++;
        }
        }
            System.out.println("Contem "+cv+" vogais");                
        return 0;
    }

}
