
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_3_Funcionarios;

public abstract class Funcionario {
protected String nome;
protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public abstract double calcular_bonus(int porcentagem);
}
