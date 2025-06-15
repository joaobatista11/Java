/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_5_Dispositivos_Eletronicos;

/**
 *
 * @author joao_batista
 */
public class Notebook extends Dispositivo{
private int capacidade_de_armazenamento;

    public Notebook(String marca, String modelo, int capacidade_de_armazenamento) {
        super(marca, modelo);
        this.capacidade_de_armazenamento = capacidade_de_armazenamento;
    }
    public void status(){
        System.out.println("\nNotebook\nModelo "+this.getModelo()
                +"\nMarca: "+this.getMarca()
                +"\nCapacidade de armazenamento: "+this.getCapacidade_de_armazenamento()+" GB");
    }

    public int getCapacidade_de_armazenamento() {
        return capacidade_de_armazenamento;
    }

}
