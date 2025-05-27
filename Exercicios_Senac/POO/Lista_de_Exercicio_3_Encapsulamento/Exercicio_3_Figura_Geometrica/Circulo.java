/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_3_Figura_Geometrica;

/**
 *
 * @author joao_batista
 */
public class Circulo implements Figura_Geometrica{
    private double raio;

    @Override
    public double calcular_area() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double calcular_perimetro() {
        return 2 * Math.PI  * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
