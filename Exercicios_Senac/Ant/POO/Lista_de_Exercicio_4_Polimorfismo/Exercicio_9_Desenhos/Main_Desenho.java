/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_9_Desenhos;

/**
 *
 * @author joao_batista
 */
public class Main_Desenho {
    public static void main(String[] args) {
        Desenho q = new Quadrado();
        Desenho c = new Circulo();
        Desenho t = new Triangulo();
        
        System.out.println("Desenho\nQuadrado: "+q.Desenhar()
                +"\nCírculo: "+c.Desenhar()+"\nTriângulo: "+t.Desenhar());
    }
}
