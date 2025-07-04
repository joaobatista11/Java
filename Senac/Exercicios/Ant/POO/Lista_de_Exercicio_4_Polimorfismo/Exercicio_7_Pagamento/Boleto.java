
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_7_Pagamento;

public class Boleto extends Pagamento{

    @Override
    public double Processar_Pagamento(double valor) {
        return valor;
    }

}
