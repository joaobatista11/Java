/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_9_Eletrodomesticos;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Microondas extends Eletrodomestico{
private int potencia;    
    public Microondas(String marca, String modelo, boolean ligado) {
        super(marca, modelo, ligado);
    }
    public void status(){
        System.out.println("Microondas\nModelo: "+this.getModelo()
                +"\nMarca: "+this.getMarca());
        if(ligado == true){
            System.out.println("Ligado\nPotência: "+this.getPotencia()+" watts");
        }else{
            System.out.println("Desligado");
        }
    }
    
    public int potencia(){
        Scanner sc = new Scanner(System.in);        
        if(this.isLigado()==true){
        do{
            do{
          System.out.println("Digite a potência");
          potencia = sc.nextInt();
    }while(potencia<600); 
    }while(potencia>1200);
    return potencia;
        }else{
        return potencia;
        }
    }
    public int getPotencia() {
        return potencia;
    }
    
}
