
package Exercicio_5_While;

import java.util.Scanner;

public class Exercicio_3_Tabuada {
    public static void main(String[] args) {
          Scanner tecla = new Scanner(System.in);
          int c=1;
          System.out.println("Digite um numero");
          double n = tecla.nextDouble();
          while (n<=0){
              System.out.println("Numero ivalido");
              System.out.println("Digite um numero");
              n = tecla.nextInt();
        }
          while (c<=10){
              System.out.println(n+" X "+c+" = "+(n*c));
              c++;
          }
        
          }
    }

