/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_2_Animais;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o;
        Animal a = null;

        System.out.println("Escolha som\n1 - Cachorro\n2 - Gato\n3 - Vaca");
        o=sc.nextInt();
        switch(o){
            case 1 ->{a = new Cachorro();}
            case 2 ->{a = new Gato();}
            case 3 ->{a = new Vaca();}
            default ->{System.out.println("Opção inválida");}
        }
        if(a!=null){
        a.emitir_som();
        }
    }
    
}
