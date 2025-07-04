/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_3_Figura_Geometrica;

/**
 *
 * @author joao_batista
 */
public class Retangulo implements Figura_Geometrica{
    private double comprimento, largura;
    
    @Override
    public double calcular_area() {
        return comprimento * largura;
        
    }

    @Override
    public double calcular_perimetro() {
        return (comprimento + largura)*2;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
}
