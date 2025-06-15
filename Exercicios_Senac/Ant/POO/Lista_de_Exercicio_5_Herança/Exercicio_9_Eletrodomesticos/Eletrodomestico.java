/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_9_Eletrodomesticos;

/**
 *
 * @author joao_batista
 */
public class Eletrodomestico {
private String marca, modelo;
boolean ligado;

    public Eletrodomestico(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
