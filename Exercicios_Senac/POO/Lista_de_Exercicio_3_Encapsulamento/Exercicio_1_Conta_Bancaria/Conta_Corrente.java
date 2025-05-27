
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_1_Conta_Bancaria;

public class Conta_Corrente implements Conta_Bancaria_Interface{
    private double saldo;

    // Quando usa a interface não precisa usar o construtor
    
    // Construtor
//    public Conta_Corrente(double saldo) {
//        this.saldo = saldo;
//    }

    @Override
    public void depositar(double valor) {
        if(valor>0){
        saldo +=valor;
            System.out.println("Depósito realizado com sucesso\nSaldo atual: "+saldo);
        }else{
            System.out.println("Valor inválido para o depósito.");
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor> 0 && valor <= saldo){
        saldo-=valor;
            System.out.println("Saque realizado com sucesso\nSaldo atual: "+saldo);
        }else{
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override // Interface e get
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
