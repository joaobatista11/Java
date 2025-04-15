
package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int t;
        double n, s = 0;
        System.out.println("Digite a quantidade de produtos:");
        t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Produto "+i+". Digite o valor:");
            n = sc.nextDouble();
            s += n;        
        }
        System.out.println("Total: R$"+s);
    }
}
