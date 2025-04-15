
package Prova;

import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double r;
        System.out.println("Digite um numero:");
        n = sc.nextInt();
        r = Math.sqrt(n);
        System.out.println(r);
        if(r%1==0){
        System.out.println("E quadrado perfeito");
        }else{
        System.out.println("Nao e quadrado perfeito");        
        }
    }
}
