
package Prova;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class n_Questao_20 {
    public static void main(String[] args) {
     HashSet<String>listcar = new HashSet<>();       
    HashSet<Integer>listnum = new HashSet<>(); 
    Scanner car = new Scanner(System.in);
    Scanner num = new Scanner(System.in);    
    String p;
    int n;
        for (int i = 1; i <=5; i++) {
            System.out.println(i+". Escreva o nome do(a) cliente: ");
            p = car.nextLine();
            listcar.add(p);
            System.out.println("Digite a idade de: "+p);
            n = num.nextInt();
            listnum.add(n);
        }
        
        for(int maiores: maior(listnum)){
        }
    }

    public static HashSet<Integer> maior(HashSet<Integer> listnum) {
        
   // Collections.sort(listnum);                
        
        return listnum;
    }
}
