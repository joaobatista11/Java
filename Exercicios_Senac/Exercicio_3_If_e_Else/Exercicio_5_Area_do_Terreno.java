
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_5_Area_do_Terreno {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o comprimento do terreno");
        double c = tecla.nextDouble();
        System.out.println("Digite a largura do terreno");
        double l = tecla.nextDouble();
        double a = c*l;
        System.out.println("A area do terreno e: "+a+" m²");
        if(a>=500){
            System.out.println("Terreno VIP");
        }else if(a<500 && a>=100){
            System.out.println("Terreno Master");
        }else{
            System.out.println("Terreno Popular");
        }
    }
}
