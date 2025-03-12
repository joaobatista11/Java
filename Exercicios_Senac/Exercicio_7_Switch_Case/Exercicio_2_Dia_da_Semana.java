
package Exercicio_7_Switch_Case;

import java.util.Scanner;

public class Exercicio_2_Dia_da_Semana {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero de 1 a 7");
        n = tecla.nextInt();
        switch(n){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero invalido");
        }
    }
}
