
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_2_Viagem {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a distancia que o passageiro quer percorrer:");
        double km = tecla.nextDouble();
        if(km>=200){
        double v = km*0.45;
            System.out.println("O valor vai ser R$"+v);
        }else{  
            double v = km*0.50;
            System.out.println("O valor vai ser R$"+v);            
        }
    }
}
