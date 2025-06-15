
package Lista_de_Exercicio_5_Herança.Exercicio_2_Animais;

public class Reptil extends Animal{
private String tipo_de_escama;

    public Reptil(String nome, int idade, String tipo_de_escama) {
        super(nome, idade);
        this.tipo_de_escama = tipo_de_escama;
    }

    public void status(){
        System.out.println("Mamífero\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nTipo de escama: "+this.tipo_de_escama+"\n");
    }    
    
}
