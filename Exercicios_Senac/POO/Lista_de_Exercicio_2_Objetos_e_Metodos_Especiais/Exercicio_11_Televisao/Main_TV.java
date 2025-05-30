/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_11_Televisao;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_TV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Televisao tv = new Televisao(50,1);
        int o, c;

        do{
            tv.status();
            System.out.println("1 - Aumentar volume\n2 - Diminuir volume\n3 - Trocar canal\n4 - Desligar a TV");
            o = sc.nextInt();
            switch(o){
                case 1 ->{tv.aumentar_volume();}
                case 2 ->{tv.diminuir_volume();}
                case 3 ->{System.out.println("Digite um canal");
                          c = sc.nextInt();
                          tv.trocar_canal(c);
                }
                case 4 ->{System.out.println("Desligando a TV . . .");}
                default ->{System.out.println("Opção inválida");}
            }
        }while(o!=4);
    }
   
}
