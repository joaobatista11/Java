
package Lista_de_Exercicio_1.Exercicio_6_Funcionarios;

import java.util.Scanner;

public class Main_Funcionario {
    public static void main(String[] args) {
       Scanner scstring = new Scanner(System.in);
       Scanner scdouble = new Scanner(System.in);       
       Funcionario n = new Funcionario();
        
        System.out.println("Escreva o nome do funcionario:");
        n.funcionario = scstring.nextLine();
        
        System.out.println("Escreva o nome do departamento:");
        n.departamento = scstring.nextLine();
        
        System.out.println("Digite o salario");
        n.salario = scdouble.nextDouble();
        
        System.out.println("\n## Informação do Funcionario ##\n\n"
                + "Nome: "+n.funcionario+"\nDepartamento: "+n.departamento
                +"\nSalário: "+n.salario+"\n\nDigite o aumento de salário (%):");
        n.percentual = scdouble.nextDouble();
        n.aumentar_salario();
        System.out.println("Aumento: "+n.percentual+
                "%\nSalario: R$"+n.salario);
    }
}
