
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_6_Meios_de_Transporte;

import java.util.Scanner;

public class Main_Transporte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o;
        
        System.out.println("Escolha\n1 - Carro\n2 - Avião\n3 - Navio");
        o = sc.nextInt();
        while((o!=1) && (o!=2) && (o!=3)){
            System.out.println("Opção inválida\nEscolha\n1 - Carro\n2 - Avião\n3 - Navio");
            o = sc.nextInt();
        }
        if(o==1){
            Transporte c = new Carro();
            System.out.println(c.mover());
        }else if(o==2){
            Transporte a = new Aviao();
            System.out.println(a.mover());        
        }else if(o==3){
            Transporte n = new Navio();
            System.out.println(n.mover());        
        }
    }
}
