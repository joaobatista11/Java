
package Prova;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class n_Questao_9 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        HashSet<String> set = new HashSet<>(lista);
        Scanner num = new Scanner(System.in);
        Scanner car = new Scanner(System.in);
        int t, c=0;
        String n = null;
        System.out.println("Quantos animais quer adicionar?");
        t = num.nextInt();
        for (int i = 1; i <=t; i++) {
            System.out.println(i+"Escreva um nome de um animal");
        n = car.nextLine().toLowerCase();
        lista.add(n);
        boolean dupli = set.size() == lista.size();
        if(dupli==true){
        c++;
        }
                }

        System.out.println("\nLista de animais sem duplicatas\n");
        for(String animais: set){
            System.out.println(animais);
        }
        System.out.println("\nDuplicatas: "+c);
    }
}
