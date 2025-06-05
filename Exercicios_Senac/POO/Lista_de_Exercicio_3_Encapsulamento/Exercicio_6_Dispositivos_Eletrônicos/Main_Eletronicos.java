
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_6_Dispositivos_Eletrônicos;

import java.util.Scanner;

public class Main_Eletronicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Televisao tv = new Televisao();
        Radio rd = new Radio();
        Celular cl = new Celular();
        String t,r,c;
        
        System.out.println("Televisão\nLigar? [Sim/Não]");
        t = sc.nextLine().toLowerCase();//(Locale.ITALY);
        if("sim".equals(t)){
            tv.ligar();
        }
        System.out.println("Desligar? [Sim/Não]");
        t = sc.nextLine().toLowerCase();
        if("sim".equals(t)){
            tv.desligar();
        }
        tv.obter_status();
        
        System.out.println("\nRádio\nLigar? [Sim/Não]");
        r = sc.nextLine().toLowerCase();
        if("sim".equals(r)){
            rd.ligar();
        }
        System.out.println("Desligar? [Sim/Não]");
        r = sc.nextLine().toLowerCase();
        if("sim".equals(r)){
            rd.desligar();
        }
        rd.obter_status();

        System.out.println("\nCelular\nLigar? [Sim/Não]");
        c = sc.nextLine().toLowerCase();
        if("sim".equals(c)){
            cl.ligar();
        }
        System.out.println("Desligar? [Sim/Não]");
        c = sc.nextLine().toLowerCase();
        if("sim".equals(c)){
            cl.desligar();
        }
        cl.obter_status();        
    }
}
