
package Exercicio_3_If_e_Else;

import java.util.Scanner;

public class Exercicio_6_Funcionario_Aumento {
    public static void main(String[] args) {
        Scanner teclacar = new Scanner(System.in);
        Scanner teclanum = new Scanner(System.in);
        Scanner teclaint = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario(a)");
        String n = teclacar.nextLine();
        System.out.println("Digite o salario do funcionario(a)");
        double s = teclanum.nextDouble();
        System.out.println("Digite anos que ele(a) trabalha");
        int t = teclaint.nextInt();
        if(t>=10){
        double a = s*1.20;
        System.out.println("O aumento do salario de "+n+" e R$"+a);
        }else if(t<10 && t>3){
        double a = s*1.125;    
        System.out.println("O aumento do salario de "+n+" e R$"+a);        
        }else{
        double a = s*1.03;
        System.out.println("O aumento do salario de "+n+" e R$"+a);        
        }
    }
}
