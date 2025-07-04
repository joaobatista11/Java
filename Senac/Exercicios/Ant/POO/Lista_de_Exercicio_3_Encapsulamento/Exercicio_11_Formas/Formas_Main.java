/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_11_Formas;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Formas_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cl,r;
        
        System.out.println("Quadrado\n\nDigite o comprimento e largura");
        cl = sc.nextDouble();
        
        System.out.println("\nCírculo\n\nDigite o raio");
        r = sc.nextDouble();
        
        Quadrado quad = new Quadrado();
        quad.setComprimento_e_largura(cl);
        
        Circulo cir = new Circulo();
        cir.setRaio(r);
        
        System.out.println("Quadrado\nÁrea: "+quad.calcular_area()+"\nPerímetro: "+quad.calcular_perimetro()
        +"\n\nCírculo\nÁrea: "+cir.calcular_area()+"\nPerímetro: "+cir.calcular_perimetro());
        
        
    
    
    }
    
}
