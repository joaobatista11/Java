/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_11_Televisao;

/**
 *
 * @author joao_batista
 */
public class Televisao {
int volume, canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public void status(){
        System.out.println("Televisão");
        System.out.println("Volume: "+this.volume);
        System.out.println("Canal: "+this.canal);
    }
    
    public int trocar_canal(int novo_canal){
        if(novo_canal>0){
            return this.canal=novo_canal;
        }else{
            System.out.println("Canal inválido");
            return this.canal;
        }
    }
    
    public void aumentar_volume(){
        int v = 10;
        if(this.volume!=100){
        setVolume(v);
        }
    }

    public void diminuir_volume(){
        int v = -10;
        if(this.volume!=0){
        setVolume(v);
        }
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume += volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

}
