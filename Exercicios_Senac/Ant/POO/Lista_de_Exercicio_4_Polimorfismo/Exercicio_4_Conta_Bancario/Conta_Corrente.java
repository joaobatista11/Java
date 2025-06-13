
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_4_Conta_Bancario;

public class Conta_Corrente extends Conta {

    public Conta_Corrente(double saldo, int numero_conta) {
        super(saldo, numero_conta);
    }


    @Override
    public double depositar(double valor) {
        if(valor>0){
            return saldo+=valor;
        }else{
            System.out.println("Valor inválido");
            return saldo;
        }
    }

    @Override
    public double sacar(double valor) {
        if(valor>0 && valor<=saldo && valor<1000){
            return saldo-=valor;
        }else{
            System.out.println("Valor inválido");            
            return saldo;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
