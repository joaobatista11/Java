
package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class Questao_33 {
    public static void main(String[] args) {
        Scanner scnum = new Scanner(System.in);
        Scanner sccar = new Scanner(System.in);        
        HashSet<String> set = new HashSet<>();
        int t;
        System.out.println("Digite a quantidade");
        t = scnum.nextInt();
        String p;
        for (int i = 1; i <= t; i++) {
            System.out.println(i + ". Digite um produto");
            p = sccar.nextLine().toLowerCase();
            set.add(p);

        }
        
        for (String animais : set) {
            System.out.println(animais);
        }System.out.println("Digite um produto para verificar");
            p = sccar.nextLine().toLowerCase();        
        if (set.contains(p)) {
            System.out.println("\nContem "+p);
        }else{
            System.out.println("\nNao contem "+p);        
        }
    }
}
