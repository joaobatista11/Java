
package Lista_de_Exercicio_5_Herança.Exercicio_2_Animais;

public class Ave extends Animal{
private double envergadura_das_asas;

    public Ave(String nome, int idade, double envergadura_das_asas) {
        super(nome, idade);
        this.envergadura_das_asas = envergadura_das_asas;
    }

    public void status(){
        System.out.println("Mamífero\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nEnvergadura da asa: "+this.envergadura_das_asas+"\n");
    }
    
}
