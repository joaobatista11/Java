
package Prova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class n_Questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Digite o tamanho dos arrays:");
        t=sc.nextInt();
        int[]a= new int[t];
        int[]b= new int[t];
        System.out.println("Array 1");        
        for (int i = 0; i < t; i++) {
            System.out.println(i+1+". Digite um numero:");
            a[i] = sc.nextInt();
        }
        System.out.println("Array 2");        
        for (int i = 0; i < t; i++) {
            System.out.println(i+1+". Digite um numero:");
            b[i] = sc.nextInt();
        }
        System.out.println("Interseccao: "+interseccao(a,b,t));
    }

    public static ArrayList<Integer> interseccao(int[] a, int[] b, int t) {
        ArrayList<Integer> set = new ArrayList<>();

        int c=0,r=0;
        int[]in = new int[t];
        for (int i = 0; i < t; i++) {
            for(int comp: a)
            if(Arrays.asList(comp).contains(b)){
            set.add(comp);    
            }
               
        }
        set.toArray();         
        return set;
    }
}
