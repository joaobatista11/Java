
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_1_Conta_Bancaria;

import java.util.Scanner;

public class Main_Conta_Corrente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta_Corrente cc = new Conta_Corrente();
        System.out.println("Bem vindo ao SISTEMA BANCÁRIO");
        while(true){
            System.out.println("\nEscolha uma opção:\n1 - Depositar\n2 - Sacar\n3 - Consultar saldo\n4 - Sair");
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Informe o valor para o depósito");
                    double deposito = sc.nextDouble();
                    cc.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Informe o valor para sacar:");
                    double saque = sc.nextDouble();
                    cc.sacar(saque);
                case 3:
                    System.out.println("Saldo atual: "+cc.getSaldo());
                    break;
                case 4:
                    System.out.println("Obrigado por usar o SISTEMA BANCÁRIO");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.Tente novamente");
            }
        }
    }
}
