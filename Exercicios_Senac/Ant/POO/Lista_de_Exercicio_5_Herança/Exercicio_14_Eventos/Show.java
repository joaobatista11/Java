
package Lista_de_Exercicio_5_Herança.Exercicio_14_Eventos;

public class Show extends Evento{
private final String artista;
    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }
    
    public void status(){
        System.out.println("Show\nNome: "+this.getNome()
                +"\nData: "+this.getData()
                +"\nArtista: "+this.artista+"\n");
    }

}
