
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n;
        for (int i = 1; i <=10; i++) {
            System.out.println(i+". Digite um numero:");    
            n = sc.nextInt();
            if(n>20 && n<70){
            set.add(n);
            }
        }
        System.out.println("Lista de numeros maiores que 20 e menores que 70");
        for(int r: set){
            System.out.println(r);
        }
    }
}
