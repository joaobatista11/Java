
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_9_e_15_Funcionarios_Especial;

import java.util.Scanner;

public class Main_Funcionario_Especial {
    public static void main(String[] args) {
       Scanner scdouble = new Scanner(System.in);       
       Funcionario_Especial n = new Funcionario_Especial("Cláudio","TI",1000);
       int p;
       n.status();
        System.out.println("Digite o aumento percentual do sálario:");
        p = scdouble.nextInt();
        n.aumentar_salario(p);
        System.out.println("Aumento: "+p+
                "%\nSalário: R$"+n.salario);
    }
}
