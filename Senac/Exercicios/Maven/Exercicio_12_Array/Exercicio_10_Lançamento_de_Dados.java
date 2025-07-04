
package Exercicio_12_Array;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_10_Lançamento_de_Dados {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[]dados={1,2,3,4,5,6};
                int t,s=0;
        System.out.println("Quantos dados voce quer lancar?");
        t = sc.nextInt();
        System.out.println("\nSeus Dados\n");
        for (int i = 0; i < t; i++) {            
            int roll = dados[rd.nextInt(dados.length)];
            System.out.println(roll);
            s+=roll;
        }
        System.out.println("\nSoma: "+s);
    }
}
