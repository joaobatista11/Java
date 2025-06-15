/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_9_Eletrodomesticos;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Eletrodomesticos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String tma, tmo, tl, gma, gmo, gl, mma, mmo, ml;
        
        System.out.println("Televisão\nDigite o modelo");
        tmo = sc.nextLine();
        System.out.println("Digite a marca");
        tma = sc.nextLine();
        System.out.println("Ligar [Sim/Não]");
        tl = sc.nextLine().toLowerCase();
        Televisao t = new Televisao(tma,tmo,false); 
        if("sim".equals(tl)){
        t.setLigado(true);
        }
        t.canal();
        t.volume();
        t.status();
        
        System.out.println("\nGeladeira\nDigite o modelo");
        gmo = sc.nextLine();
        System.out.println("Digite a marca");
        gma = sc.nextLine();
        System.out.println("Ligar [Sim/Não]");
        gl = sc.nextLine().toLowerCase();
        Geladeira g = new Geladeira(gma,gmo,false); 
        if("sim".equals(gl)){
        g.setLigado(true);
        }
        g.temperatura();
        g.status();
        
        System.out.println("\nMicroondas\nDigite o modelo");
        mmo = sc.nextLine();
        System.out.println("Digite a marca");
        mma = sc.nextLine();
        System.out.println("Ligar [Sim/Não]");
        ml = sc.nextLine().toLowerCase();
        Microondas m = new Microondas(mma,mmo,false); 
        if("sim".equals(ml)){
        m.setLigado(true);
        }
        m.potencia();
        m.status();         
    }
    
}
