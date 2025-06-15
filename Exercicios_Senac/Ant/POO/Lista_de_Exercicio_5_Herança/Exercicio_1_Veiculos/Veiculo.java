
package Lista_de_Exercicio_5_Herança.Exercicio_1_Veiculos;

public class Veiculo {
private String marca, modelo;
private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public int getAno() {
        return ano;
    }
    
}
