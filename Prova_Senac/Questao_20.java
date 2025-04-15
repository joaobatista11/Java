
package Prova;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Questao_20 {
    public static void main(String[] args) {
 HashSet<String>listcar = new HashSet<>();       
 ArrayList<Integer>listnum = new ArrayList<>(); 
    Scanner car = new Scanner(System.in);
    Scanner num = new Scanner(System.in);    
    String p;
    int n = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+". Escreva o nome do(a) cliente: ");
            p = car.nextLine();
            listcar.add(p);
            System.out.println("Digite a idade do(a) "+p);
            n = num.nextInt();
            listnum.add(n);
        }
        System.out.println("Os maiores de 18 anos");
        for(int r: maiordeidade(listnum)){
            System.out.println(r);
        }
    }

    private static ArrayList<Integer> maiordeidade(ArrayList<Integer>listnum) {
 ArrayList<Integer>listmaior = new ArrayList<>();         
        for(int m: listnum){
        if(m>=18){
        listmaior.add(m);
        }
        }
        return listmaior;
    }
}
