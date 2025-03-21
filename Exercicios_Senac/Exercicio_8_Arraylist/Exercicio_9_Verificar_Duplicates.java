
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_9_Verificar_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros (alguns podem se repetir)");
        for(int c=1;c<=10;c++){
            System.out.println("Numero "+c+":");        
        lista.add(tecla.nextInt());
        }
        HashSet<Integer>set =new HashSet<>(lista);
        boolean hashDuplicatas = set.size() != lista.size();
        if(hashDuplicatas==true){
        System.out.println("Tem duplicatas");
            System.out.println("Lista sem duplicatas: "+set);
        }else{
            System.out.println("Nao tem duplicatas");
        }
        }  
    }

