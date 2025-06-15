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
public class Televisao extends Eletrodomestico{
private int canal, volume;

    public Televisao(String marca, String modelo, boolean ligado) {
        super(marca, modelo, ligado);
    }

    
    public void status(){
        System.out.println("Televisão\nModelo: "+this.getModelo()
                +"\nMarca: "+this.getMarca());
        if(ligado == true){
            System.out.println("Ligada\nCanal: "+this.getCanal()
                    +"\nVolume: "+this.getVolume());
        }else{
            System.out.println("Desligada");
        }
    }
    
    public int canal(){
        Scanner sc = new Scanner(System.in);        
        if(this.isLigado()==true){
        do{
          System.out.println("Digite o canal");
          canal = sc.nextInt();
    }while(canal<1);
    return canal;
    }else {
            return canal;
        }
    }
    
    public int volume (){
        Scanner sc = new Scanner(System.in);        
        if(this.isLigado()==true){
        do{
            do{
          System.out.println("Digite o volume");
          volume = sc.nextInt();
    }while(volume<1);
        }while(volume>100);
    return volume;
        }else {
            return volume;
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
   
}
