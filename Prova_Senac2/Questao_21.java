
package Prova;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Questao_21 {
public static void main(String[] args) {
         ArrayList<Integer> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
        int g = new Random().nextInt(100);
            System.out.println(g);
            if(g%4==0){
            lista.add(g);
            }
            }
        lista.toArray();
    System.out.println(lista);
}
}
