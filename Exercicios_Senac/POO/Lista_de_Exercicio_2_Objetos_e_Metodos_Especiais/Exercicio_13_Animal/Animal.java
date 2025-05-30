/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_13_Animal;

/**
 *
 * @author joao_batista
 */
public class Animal {
String animal, especie;

    public Animal(String animal, String especie) {
        this.animal = animal;
        this.especie = especie;
    }

    public void status(){
        System.out.println("## Animal ##\nNome:"+this.animal+"\nEspécie: "+this.especie);
    }
    
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }



}
