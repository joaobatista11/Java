
package Prova;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class n_Questao_36 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("Digite a quantidade");
        t = sc.nextInt();
        int[] n = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.println((i + 1)+". Digite um numero:");
            n[i] = sc.nextInt();
        }
        if(verificar_crescente(n,t)==true){
            System.out.println("A ordem esta em crescente");
        }else{
            System.out.println("A ordem nao esta em crescente");        
        }
    }

    private static boolean verificar_crescente(int[] n, int t) {
        int[] r = n;
        int c=0;
        sort(r);
        for (int i = 0; i < t; i++) {
        if(n[i]==r[i]){
        c++;
        }
        }
        
        if(c==t){
        return true;
        }else{
        return false;
        }
    }
}
