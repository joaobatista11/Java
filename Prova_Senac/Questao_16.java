
package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao_16 {
    public static void main(String[] args) {
         ArrayList<String>listcar = new ArrayList<>();       
 ArrayList<Double>listnum = new ArrayList<>(); 
    Scanner car = new Scanner(System.in);
    Scanner num = new Scanner(System.in);    
    String p;
    double n;
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+". Escreva o nome do produto: ");
            p = car.nextLine();
            listcar.add(p);
            System.out.println("Digite o valor do produto: ");
            n = num.nextDouble();
        if(n<=50){
        listnum.add(n);
        }
        }
        System.out.println("Produtos maenos de R$50,00");
            for(double r: listnum)
            System.out.println(+r);
    }
        }
    