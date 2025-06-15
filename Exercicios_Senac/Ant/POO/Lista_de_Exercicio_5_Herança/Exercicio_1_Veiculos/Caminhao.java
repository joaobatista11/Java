
package Lista_de_Exercicio_5_Herança.Exercicio_1_Veiculos;

public class Caminhao extends Veiculo{
private final int capacidade_de_carga;
    public Caminhao(String marca, String modelo, int ano, int capacidade_de_carga) {
        super(marca, modelo, ano);
        this.capacidade_de_carga = capacidade_de_carga;
    }
    public void status(){
        System.out.println("Moto\nMarca: "+this.getMarca()
                +"\nModelo: "+this.getModelo()
                +"\nAno: "+this.getAno()
                +"\nCapacidade de carga: "+this.capacidade_de_carga+"\n");
    }

}
