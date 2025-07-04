
package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>lista = new ArrayList<>();
        int n;
        for (int i = 1; i <= 10; i++){
            System.out.println(i+". Digite um numero:");
            n = sc.nextInt();
                    if(!(n % 2 == 0)){
                    lista.add(n);
                    }
        }
            int tam=lista.size();
     for (int c = 0; c < tam/2; c++) {   
     int t=lista.get(c);
     lista.set(c, lista.get(tam -1 -c));
     lista.set(tam -1 -c, t);
     }
        System.out.println("Impares decrescentes");
     for (int r : lista) {
            System.out.println(r);
        } 
    }
}
