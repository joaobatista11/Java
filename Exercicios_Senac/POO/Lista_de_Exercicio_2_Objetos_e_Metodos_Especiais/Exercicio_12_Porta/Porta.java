/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_12_Porta;

/**
 *
 * @author joao_batista
 */
public class Porta {
boolean aberta;

    public Porta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public void status(){
        System.out.println("Porta");
        if(aberta==true){
            System.out.println("Aberta");
        }else{
            System.out.println("Fechada");
        }
    }
    
    public boolean abrir(){
    return aberta=true;
    }

    public boolean fechar(){
    return aberta=false;
    }
    
    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

}
