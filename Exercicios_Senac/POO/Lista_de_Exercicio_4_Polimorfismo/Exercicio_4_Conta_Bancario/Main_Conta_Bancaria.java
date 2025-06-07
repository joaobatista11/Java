
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_4_Conta_Bancario;

import java.util.Scanner;

public class Main_Conta_Bancaria {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);        
        double sd, sq=0, dp=0;
        int osd, oc, n;
        System.out.println("Digite o seu número conta");
        n = sc1.nextInt();
        System.out.println("Digite o seu saldo");
        sd = sc2.nextDouble();
        System.out.println("Escolha\n1 - Conta Corrente\n2 - Conta Poupança");
        oc = sc1.nextInt();
        while((oc!=1) && (oc!=2)){
            System.out.println("Opção inválida\nEscolha\n1 - Conta Corrente\n2 - Conta Poupança");
            oc = sc1.nextInt();
        }
        
        if(oc==1){ // Conta Corrente
        Conta cc = new Conta_Corrente(sd,n);
        
        System.out.println("Escolha\n1 - Saque\n2 - Depósito");
        osd = sc1.nextInt();
        while((osd!=1) && (osd!=2)){
            System.out.println("Opção inválida\nEscolha\n1 - Saque\n2 - Depósito");
            osd = sc1.nextInt();
        }
        
        if(osd==1){
            System.out.println("Digite o saque");
            sq = sc2.nextDouble();
            System.out.println("Conta Corrente\nNovo saldo: "+cc.sacar(sq));
        }else if(osd==2){
            System.out.println("Digite o depósito");
            dp = sc2.nextDouble();
            System.out.println("Conta Corrente\nNovo saldo: "+cc.depositar(dp));
        }
        
        }else if(oc==2){ // Conta Poupança
        Conta cp = new Conta_Poupanca(sd,n);        
        
        System.out.println("Escolha\n1 - Saque\n2 - Depósito");
        osd = sc1.nextInt();
        while((osd!=1) && (osd!=2)){
            System.out.println("Opção inválida\nEscolha\n1 - Saque\n2 - Depósito");
            osd = sc1.nextInt();
        }
        if(osd==1){
            System.out.println("Digite o saque");
            sq = sc2.nextDouble();
            System.out.println("Conta Poupança\nNovo saldo: "+cp.sacar(sq));
        }else if(osd==2){
            System.out.println("Digite o depósito");
            dp = sc2.nextDouble();
            System.out.println("Conta Poupança\nNovo saldo: "+cp.depositar(dp));
        }
        }
        
    }
}
