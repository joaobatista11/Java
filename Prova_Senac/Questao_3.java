package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
 ArrayList<String>listcar = new ArrayList<>();       
 ArrayList<Double>listnum = new ArrayList<>(); 
    Scanner car = new Scanner(System.in);
    Scanner num = new Scanner(System.in);    
    String p;
    double n;
        for (int i = 1; i <=5; i++) {
            System.out.println(i+". Escreva o nome do produto: ");
            p = car.nextLine();
            listcar.add(p);
            System.out.println("Digite o valor do produto: "+p);
            n = num.nextDouble();
            listnum.add(n);
        }
        System.out.println("Produtos mais de R$100,00");
            for(double r: produto(listnum))
            System.out.println(+r);

        }
    
    public static ArrayList<Double> produto(ArrayList<Double> listnum) {
     ArrayList<Double>listprod = new ArrayList<>();     
        for(double lista: listnum){
        if(lista>=100){
        listprod.add(lista);
        }
        }
        
        return listprod;

    }
}
