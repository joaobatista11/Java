
package Prova;

import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    int n,t,c=0;
        System.out.println("Digite o tamanho da lista");
        t = sc.nextInt();
        for (int i = 1; i <=t; i++) {
            System.out.println("A digite a idade da pessoa "+i);
            n = sc.nextInt();
            if(n==18 || n==30){
            c++;
            }
        }
        System.out.println("Pessoas que tem 18 e 30 anos: "+c);
    }
}
