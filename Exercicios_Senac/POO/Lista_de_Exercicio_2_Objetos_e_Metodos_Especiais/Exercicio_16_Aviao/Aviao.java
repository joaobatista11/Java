/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_16_Aviao;

/**
 *
 * @author joao_batista
 */
public class Aviao {
String modelo;
int capacidade_de_passageiro, velocidade_maxima;

    public Aviao(String modelo, int capacidade_de_passageiro, int velocidade_maxima) {
        this.modelo = modelo;
        this.capacidade_de_passageiro = capacidade_de_passageiro;
        this.velocidade_maxima = velocidade_maxima;
    }

    public void status(){
        System.out.println("## Avião ##\nModelo: "+this.modelo+"\nCapacidade de Passageiros: "+this.capacidade_de_passageiro
        +"\nVelocidade Máxima: "+this.velocidade_maxima+" Km/h");
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade_de_passageiro() {
        return capacidade_de_passageiro;
    }

    public void setCapacidade_de_passageiro(int capacidade_de_passageiro) {
        this.capacidade_de_passageiro = capacidade_de_passageiro;
    }

    public int getVelocidade_maxima() {
        return velocidade_maxima;
    }

    public void setVelocidade_maxima(int velocidade_maxima) {
        this.velocidade_maxima = velocidade_maxima;
    }



}
