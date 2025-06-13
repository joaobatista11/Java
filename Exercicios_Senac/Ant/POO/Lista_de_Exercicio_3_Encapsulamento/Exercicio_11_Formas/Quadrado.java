/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_11_Formas;

/**
 *
 * @author joao_batista
 */
public class Quadrado implements Formas{
    private double comprimento_e_largura;
    
    @Override
    public double calcular_area() {
        return comprimento_e_largura * comprimento_e_largura;
        
    }

    @Override
    public double calcular_perimetro() {
        return comprimento_e_largura * 4;
    }

    public double getComprimento_e_largura() {
        return comprimento_e_largura;
    }

    public void setComprimento_e_largura(double comprimento_e_largura) {
        this.comprimento_e_largura = comprimento_e_largura;
    }
    
}
