
package Exercicio_12_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_7_Contem_no_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tecla = new Scanner(System.in);        
        int t;
        String c,p = null;
        System.out.println("Quantos elementos voce quer?");
        t = sc.nextInt();
        String[] a = new String[t];
        for (int i = 0; i < t; i++) {
            
            System.out.println((i+1)+". Escreva uma palavra:");
            p = tecla.nextLine();
            a[i] = p;
        }
        System.out.println("Lista\n"+Arrays.toString(a)+"\n\nQual elemento quer verificar?");
            c = tecla.nextLine();
            //boolean contem = a.contains(c);
           // boolean contem = /*Arrays.toString(a)*/a.equals(c);
           boolean contem = Arrays.asList(a).contains(c);
            if(contem==true){
                System.out.println("Contem "+c);
            }else{
                System.out.println("Nao Contem "+c);            
            }
    }
}