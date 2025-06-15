/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_5_Dispositivos_Eletronicos;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Dispositivo {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);
        String sma, smo, tma, tmo,  nma, nmo;
        double stm, ttm;
        int nca;
        
        System.out.println("Smartphone\nDigite o modelo");
        smo = sc_car.nextLine();
        System.out.println("Digite a marca");
        sma = sc_car.nextLine();
        System.out.println("Digite o tamanho da tela");
        stm = sc_num.nextDouble();

        System.out.println("Tablet\nDigite o modelo");
        tmo = sc_car.nextLine();
        System.out.println("Digite a marca");
        tma = sc_car.nextLine();
        System.out.println("Digite o tamanho da tela");
        ttm = sc_num.nextDouble();

        System.out.println("Notebook\nDigite o modelo");
        nmo = sc_car.nextLine();
        System.out.println("Digite a marca");
        nma = sc_car.nextLine();
        System.out.println("Digite a capacidade de armazenamento (GB)"); 
        nca = sc_num.nextInt();        
    Smartphone s = new Smartphone(sma,smo,stm);
    Tablet t = new Tablet(tma,tmo,ttm);
    Notebook n = new Notebook(nma,nmo,nca);
    
    s.status();
    t.status();
    n.status();
    }
}
