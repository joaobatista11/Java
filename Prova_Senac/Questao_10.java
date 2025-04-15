
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        System.out.println("Digite o tamanho dos arrays:");
        t=sc.nextInt();
        int[]a= new int[t];
        for (int i = 0; i < t; i++) {
            System.out.println(i+1+". Digite um numero:");
            a[i] = sc.nextInt();
        }
        System.out.println("Array sem duplicatas: "+semduplicatas(a,t));        
    }

    public static HashSet<Integer> semduplicatas(int[] a, int t) {        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
        set.add(a[i]);
        }
        set.toArray();
        return set;
        
    }
}
