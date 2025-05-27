
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_5_Pagamento;

public class Assalariado implements Pagavel{
private double salario;
    @Override
    public double calcular_pagamento() {
        return salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
