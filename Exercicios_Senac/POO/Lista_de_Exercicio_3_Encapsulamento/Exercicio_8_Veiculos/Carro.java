
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_8_Veiculos;

public class Carro implements Veiculo{

    @Override
    public String acelerar() {
        return "Acelerando com o Carro";
    }

    @Override
    public String frear() {
        return "Freando com o carro";
    }

    @Override
    public String virar(String direcao) {
        return "Virando para a "+direcao+" com o Carro";
    }

}
