/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_12_Porta;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Porta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int af;
        Porta p = new Porta(false);
        do{
            p.status();
            System.out.println("\n1 - Abrir\n2 - Fechar");
            af = sc.nextInt();
            if(af==1){
                p.abrir();
            }else if(af==2){
                System.out.println("A porta já tá fechada");
                p.fechar();
            }
        }while(p.aberta!=true);

        do{
            p.status();
            System.out.println("\n1 - Abrir\n2 - Fechar");
            af = sc.nextInt();
            if(af==1){
                System.out.println("A porta já tá aberta");                
                p.abrir();
            }else if(af==2){
                p.fechar();
            }
        }while(p.aberta!=false);        
    }
    
}
