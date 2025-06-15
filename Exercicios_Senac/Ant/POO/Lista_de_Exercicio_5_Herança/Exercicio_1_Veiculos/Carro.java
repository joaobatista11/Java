
package Lista_de_Exercicio_5_Herança.Exercicio_1_Veiculos;

public class Carro extends Veiculo{
private final int numero_de_portas;

    public Carro(String marca, String modelo, int ano, int numero_de_portas) {
        super(marca, modelo, ano);
        this.numero_de_portas = numero_de_portas;
    }
    public void status(){
        System.out.println("Carro\nMarca: "+this.getMarca()
                +"\nModelo: "+this.getModelo()
                +"\nAno: "+this.getAno()
                +"\nQuantidade de portas: "+this.numero_de_portas+"\n");
    }

}
