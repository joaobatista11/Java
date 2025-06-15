/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_5_Dispositivos_Eletronicos;

/**
 *
 * @author joao_batista
 */
public class Smartphone extends Dispositivo{
private double tamanho_da_tela;

    public Smartphone(String marca, String modelo, double tamanho_da_tela) {
        super(marca, modelo);
        this.tamanho_da_tela = tamanho_da_tela;
    }
    public void status(){
        System.out.println("\nSmartphone\nModelo "+this.getModelo()
                +"\nMarca: "+this.getMarca()
                +"\nTamanho da tela: "+this.getTamanho_da_tela()+" Polegadas");
    }

    public double getTamanho_da_tela() {
        return tamanho_da_tela;
    }

}
