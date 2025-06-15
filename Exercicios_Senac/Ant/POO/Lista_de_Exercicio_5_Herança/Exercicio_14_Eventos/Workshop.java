
package Lista_de_Exercicio_5_Herança.Exercicio_14_Eventos;

public class Workshop extends Evento{
private String tema;

    public Workshop(String nome, String data, String tema) {
        super(nome, data);
        this.tema = tema;
    }
    public void status(){
        System.out.println("Show\nNome: "+this.getNome()
                +"\nData: "+this.getData()
                +"\nTema: "+this.tema+"\n");
    }
    public String getTema() {
        return tema;
    }

}
