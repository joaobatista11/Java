
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_3_Funcionarios;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcular_bonus(int porcentagem) {
    return salario *(1+(0.01*porcentagem));
    }

}
