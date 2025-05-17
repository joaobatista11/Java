
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_3_Compare_2_Numeros {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int n1 = tecla.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = tecla.nextInt();
        if(n1>n2){
            System.out.println("O primeiro numero e maior");    
        }else if(n1==n2){
            System.out.println("Os dois numeros sao iguais");
        }else{
            System.out.println("O segundo numero e maior");            
        }
    }
}
