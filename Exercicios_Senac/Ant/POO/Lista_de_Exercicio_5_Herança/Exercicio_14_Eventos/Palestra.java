
package Lista_de_Exercicio_5_Herança.Exercicio_14_Eventos;

public class Palestra extends Evento{
private final String palestrante;

    public Palestra(String nome, String data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public void status(){
        System.out.println("Show\nNome: "+this.getNome()
                +"\nData: "+this.getData()
                +"\nPalestrante: "+this.palestrante+"\n");
    }    

}
