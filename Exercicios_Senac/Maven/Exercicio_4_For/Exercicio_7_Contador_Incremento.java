
package Exercicio_4_For;

import java.util.Scanner;

public class Exercicio_7_Contador_Incremento {
public static void main(String[] args) {
    Scanner tecla = new Scanner(System.in);
    System.out.println("Digite um numero inicial");
    int n = tecla.nextInt();
    System.out.println("Digite um numero final");
    int f = tecla.nextInt();
    System.out.println("Digite um incremento");
    int i = tecla.nextInt();    
    for (int c = n; c <= f || c >=f; c+=i){
        System.out.println(c);
        if(c==f){
        break;
        }
        }
    }
}
