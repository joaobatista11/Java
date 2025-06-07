
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_3_Funcionarios;

public class Vendedor extends Funcionario{
private int vendas;
    public Vendedor(String nome, double salario, int vendas) {
        super(nome, salario);
        this.vendas = vendas;
    }

    @Override
    public double calcular_bonus(int porcentagem) {
        return salario *(1+(0.01*porcentagem));
    }

}
