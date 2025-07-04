
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_8_IMC {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o seu peso");
        double p = tecla.nextDouble();
        System.out.println("Digite a sua altura");
        double a = tecla.nextDouble();
        double i = p/(Math.pow(a, 2));
        System.out.println("IMC: "+i);
        if(i<18.5){
            System.out.println("Abaixo do peso");
        }else if(i>=18.5 && i<=25){
            System.out.println("Peso ideal");
        }else if (i>25 && i<=30){
            System.out.println("Sobrepeso");
        }else if (i>30 && i<=40){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade morbida");
        }
    }
}
