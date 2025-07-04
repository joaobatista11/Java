
package Prova;

import java.util.Scanner;

public class Questao_25 {
public static void main(String[] args) {
    Scanner tecla = new Scanner(System.in);    
    String p;
    int c=-1;
    System.out.println("Digite uma frase");        
    p=tecla.nextLine().toLowerCase();
    for(char l: p.toCharArray()){
        if(l == l){
    c++;
    }
    }
    if(c<=0){
        System.out.println("Contem 0 letras repetidas");    
    }
        System.out.println("Contem "+c+" letras repetidas");
    }
}
