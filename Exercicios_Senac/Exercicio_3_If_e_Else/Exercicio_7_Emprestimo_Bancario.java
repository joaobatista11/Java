
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_7_Emprestimo_Bancario {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        Scanner teclaint = new Scanner(System.in);        
        System.out.println("Digite o valor da casa");
        double c = tecla.nextDouble();
        System.out.println("Digite o salario do comprador");
        double s = tecla.nextDouble();
        System.out.println("Digite quantos anos o parcelamento");
        int a = teclaint.nextInt();        
        double d = s*0.3;
        double p = c/(a*12);
        System.out.println(d);
        if(p>d){
                System.out.println(p);
            System.out.println("O emprestimo foi negado. Excedeu o 30% do salario"); 
        }else{
            System.out.println("valor da prestacao mensal R$"+p);
        }
    
    
    }
}
