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
public class Geladeira extends Eletrodomestico{
private int temperatura;    

    public Geladeira(String marca, String modelo, boolean ligado) {
        super(marca, modelo, ligado);
    }

    public void status(){
        System.out.println("Geladeira\nModelo: "+this.getModelo()
                +"\nMarca: "+this.getMarca());
        if(ligado == true){
            System.out.println("Ligada\nTemperatura: "+this.getTemperatura()+"ºC");
        }else{
            System.out.println("Desligada");
        }
    }
    
    public int temperatura(){
        Scanner sc = new Scanner(System.in);        
        if(this.isLigado()==true){
        do{
            do{
          System.out.println("Digite a temperatura");
          temperatura = sc.nextInt();
    }while(temperatura<2);
        }while(temperatura > 8);
    return temperatura;
        }else{
        return temperatura;
        }
    }

    public int getTemperatura() {
        return temperatura;
    }
    
}
