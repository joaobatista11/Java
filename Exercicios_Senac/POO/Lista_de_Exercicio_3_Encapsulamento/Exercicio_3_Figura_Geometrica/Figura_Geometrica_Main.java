/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_3_Figura_Geometrica;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Figura_Geometrica_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c,l,r;
        
        System.out.println("Retângulo\n\nDigite o comprimento");
        c = sc.nextDouble();
        System.out.println("Digite a largura");
        l = sc.nextDouble();
        System.out.println("\nCírculo\n\nDigite o raio");
        r = sc.nextDouble();
        
        Retangulo ret = new Retangulo();
        ret.setComprimento(c);
        ret.setLargura(l);
        
        Circulo cir = new Circulo();
        cir.setRaio(r);
        
        System.out.println("Retângulo\nÁrea: "+ret.calcular_area()+"\nPerímetro: "+ret.calcular_perimetro()
        +"\n\nCírculo\nÁrea: "+cir.calcular_area()+"\nPerímetro: "+cir.calcular_perimetro());
        
        
    
    
    }
    
}
