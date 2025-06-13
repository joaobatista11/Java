
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_8_Veiculos;

public class Bicicleta implements Veiculo{

@Override
    public String acelerar() {
        return "Acelerando com a bicicleta";
    }

    @Override
    public String frear() {
        return "Freando com a bicicleta";
    }

    @Override
    public String virar(String direcao) {
        return "Virado para a "+direcao+" com a bicicleta";
    }
}
