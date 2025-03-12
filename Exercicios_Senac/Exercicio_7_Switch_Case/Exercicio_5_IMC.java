
package Exercicio_7_Switch_Case;

import java.util.Scanner;

public class Exercicio_5_IMC {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double p,a,i;
        int o=0;
        System.out.println("Digite o seu peso");
        p = tecla.nextDouble();
        System.out.println("Digite a sua altura");
        a = tecla.nextDouble();
        i = p/(Math.pow(a, 2));
        System.out.println("IMC: "+i);
        if(i<18.5){
            o=1;
        }else if(i>=18.5 && i<=25){
            o=2;
        }else if (i>25 && i<=30){
            o=3;
        }else if (i>30 && i<=40){
            o=4;
        }else{
            o=5;
        }

        switch (o){
            case 1:
            System.out.println("Abaixo do peso");                
                break;
            case 2:
            System.out.println("Peso ideal");
                break;
            case 3:
            System.out.println("Sobrepeso");                
                break;    
            case 4:
            System.out.println("Obesidade");                
                break;
            case 5:
            System.out.println("Obesidade morbida");                
                break;    
        }
    }
}
