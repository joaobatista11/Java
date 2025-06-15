
package Lista_de_Exercicio_5_Herança.Exercicio_2_Animais;

public class Mamifero extends Animal{
String tipo_de_pelo;

    public Mamifero(String nome, int idade,String tipo_de_pelo) {
        super(nome, idade);
        this.tipo_de_pelo = tipo_de_pelo;
    }

    public void status(){
        System.out.println("Mamífero\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nTipo de pelo: "+this.tipo_de_pelo+"\n");
    }
    
}
