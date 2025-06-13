
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_7_Pagamento;

import java.util.Scanner;

public class Main_Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o;
        double v;
        
        System.out.println("Escolha\n1 - Boleto\n2 - Cartão de Crédito\n3 - Pix");
        o = sc.nextInt();
        while((o!=1) && (o!=2) && (o!=3)){
            System.out.println("Opção inválida\nEscolha\n1 - Boleto\n2 - Cartão de Crédito\n3 - Pix");
            o = sc.nextInt();
        }
        System.out.println("Digite o valor");
        v = sc.nextDouble();
        while(v<=0){
        System.out.println("Valor inválido\nDigite o valor");
        v = sc.nextDouble();        
        }
        if(o==1){
        Pagamento b = new Boleto();
            System.out.println("Boleto: R$"+b.Processar_Pagamento(v));
        }else if(o==2){
        Pagamento c = new Credito();
            System.out.println("Crédito: R$"+c.Processar_Pagamento(v));        
        }else if(o==3){
        Pagamento p = new Pix();        
            System.out.println("Pix: R$"+p.Processar_Pagamento(v));
        }
    }
}
