
package Exercicio_9_For_Each_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_4_Nota_Media {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet <Double> set = new HashSet<>();
        double n,s=0,m=0;
        for (int i = 1; i <= 5; i++) {
        System.out.println(i+". Digite a nota");
        n = tecla.nextDouble();
        s+=n;
        set.add(s);
/*        if(s!=n){
           System.out.println(set);
        }                          
*/    
        }
        m=s/5;
             System.out.println("Soma: "+s+"\nMedia: "+m);   
    }
        
    }

