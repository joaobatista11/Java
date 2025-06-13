
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_4_Media_atingida {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a primeira nota do(a) aluno(a)");
        double n1 = tecla.nextDouble();
        System.out.println("Digite a segunda nota do(a) aluno(a)");
        double n2 = tecla.nextDouble();
        double m = (n1+n2)/2;
        System.out.println("A media e "+m);
        if(m>=7){
            System.out.println("Aprovado");
        }else if(m<7 && m>=5){
            System.out.println("Recuperacao");
        }else{
            System.out.println("Reprovado");
        }
    }
}
