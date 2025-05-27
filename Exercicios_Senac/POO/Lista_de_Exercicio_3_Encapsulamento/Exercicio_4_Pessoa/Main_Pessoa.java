/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_1.Lista_de_Exercicio_3_Encapsulamento.Exercicio_4_Pessoa;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da primeira pessoa");
        String n1 = sc.nextLine();
        System.out.println("Digite a idade da primeira pessoa");
        int i1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o nome da segunda pessoa");
        String n2 = sc.nextLine();
        System.out.println("Digite a idade da segunda pessoa");
        int i2 = sc.nextInt();
        sc.nextLine();
        
        Pessoa p1 = new Pessoa(n1,i1);
        Pessoa p2 = new Pessoa(n2,i2);
        
        int comparacao = p1.compareTo(p2);
        if(comparacao < 0){
            System.out.println(p1.getNome()+" é mais novo(a) que "+p2.getNome());
        }else if(comparacao>0){
            System.out.println(p1.getNome()+" é mais velho(a) que "+p2.getNome());        
        }else{
            System.out.println(""+p1.getNome()+" tem a mesma idade que "+p2.getNome());
        }
    }
    
}
