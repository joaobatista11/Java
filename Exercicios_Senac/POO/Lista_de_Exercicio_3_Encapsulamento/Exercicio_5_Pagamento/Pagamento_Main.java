
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_5_Pagamento;

import java.util.Scanner;

public class Pagamento_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        double sh, s;
        int h;
        System.out.println("Funcionário Horista\nDigite o salário por hora:");
        sh = sc.nextDouble();
        System.out.println("Digite a hora total que ele trabalhou:");
        h = sc.nextInt();
        System.out.println("\nFuncionário Assalariado\nDigite o salário:");
        s = sc.nextDouble();
        
        Horista ho = new Horista();
        ho.setSalario(sh);
        ho.setHora(h);
        
        Assalariado so = new Assalariado();
        so.setSalario(s);
        
        System.out.println("\nFuncionário Horista\nSalário: "+ho.calcular_pagamento()
        +"\n\nFuncionário Assalariado\nSalário: "+so.calcular_pagamento());
    
    }
}
