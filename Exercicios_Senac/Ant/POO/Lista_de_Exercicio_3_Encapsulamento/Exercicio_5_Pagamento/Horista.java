
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_5_Pagamento;

public class Horista implements Pagavel{
private double salario;
private int hora;

    @Override
    public double calcular_pagamento() {
        return salario*hora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}
