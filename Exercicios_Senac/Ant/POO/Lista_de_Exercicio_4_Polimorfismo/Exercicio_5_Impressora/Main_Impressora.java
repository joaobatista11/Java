
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_5_Impressora;

import java.util.Scanner;

public class Main_Impressora {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);        
        String t;
        int o;
        System.out.println("Escreva:");
        t = sc1.nextLine();
        System.out.println("Escolha\n1 - Impressora a laser\n2 - Impressora jato de tinta");
        o = sc2.nextInt();
        while((o!=1) && (o!=2)){
            System.out.println("Opção inválida\nEscolha\n1 - Conta Corrente\n2 - Conta Poupança");
            o = sc1.nextInt();
        }
        if(o==1){
        Impressora il = new Impressora_a_Laser();
        il.imprimir(t);
        }else if(o==2){
        Impressora ijt = new Impressora_Jato_de_tinta();
        ijt.imprimir(t);
        }
    }
}
