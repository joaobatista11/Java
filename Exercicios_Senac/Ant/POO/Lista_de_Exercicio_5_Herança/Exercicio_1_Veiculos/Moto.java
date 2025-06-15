
package Lista_de_Exercicio_5_Herança.Exercicio_1_Veiculos;

public class Moto extends Veiculo{
private final int cilindradas;
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    public void status(){
        System.out.println("Moto\nMarca: "+this.getMarca()
                +"\nModelo: "+this.getModelo()
                +"\nAno: "+this.getAno()
                +"\nCilindradas: "+this.cilindradas+"\n");
    }

}
