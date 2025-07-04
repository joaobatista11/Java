
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_4_Conta_Bancario;

public abstract class Conta {
protected double saldo;
protected int numero_conta;

    public Conta(double saldo, int numero_conta) {
        this.saldo = saldo;
        this.numero_conta = numero_conta;
    }

public abstract double depositar(double valor);
public abstract double sacar (double valor);
}
