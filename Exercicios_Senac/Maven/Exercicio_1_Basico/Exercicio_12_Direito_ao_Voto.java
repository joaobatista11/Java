/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_1_Basico;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Exercicio_12_Direito_ao_Voto {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento:");
        int a = tecla.nextInt();
        int i = 2024 - a;
        if (i < 16) {
            System.out.println("Voce tem "+i+" anos. Nao tem direito ao voto");
        } else {
            System.out.println("Voce tem "+i+" anos. Tem direito ao voto");
        }
    }

}
