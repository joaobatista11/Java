
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_8_Intrumentos_Musicais;

import java.util.Scanner;

public class Main_Instrumentos_Musicais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o;
        
        System.out.println("Escolha\n1 - Guitaraa\n2 - Piano\n3 - Bateria");
        o = sc.nextInt();
        while((o!=1) && (o!=2) && (o!=3)){
            System.out.println("Opção inválida\nEscolha\n1 - Guitaraa\n2 - Piano\n3 - Bateria");
            o = sc.nextInt();
        }
        if(o==1){
            Instrumento g = new Guitarra();
            System.out.println(g.tocar());
        }else if(o==2){
            Instrumento p = new Piano();
            System.out.println(p.tocar());        
        }else if(o==3){
            Instrumento b = new Bateria();
            System.out.println(b.tocar());        
        }
    }
}
