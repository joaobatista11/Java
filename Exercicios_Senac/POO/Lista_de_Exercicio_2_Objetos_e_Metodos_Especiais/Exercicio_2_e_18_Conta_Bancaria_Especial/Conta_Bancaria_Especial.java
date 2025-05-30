
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_2_e_18_Conta_Bancaria_Especial;

public class Conta_Bancaria_Especial {
    private String numero_conta, titular;
    private double saldo;

    public Conta_Bancaria_Especial(String numero_conta, String titular, double saldo) {
        this.numero_conta = numero_conta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void status(){
        System.out.println("## Informação ##\nTitular: "+this.titular+"\nNumero da conta: "+this.numero_conta+"\nSaldo: "+this.saldo);
    }

void depositar (double valor){ // variavel com parâmetro. Valor = Depositar (variavel vazia)
    if(valor > 0){
    this.saldo += valor;
        System.out.println("Depósito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+this.saldo);
        }else{
        System.out.println("Valor inválido");
        }
    }
void sacar(double valor){ // Valor = Sacar. valor sacar != valor depositar (porque os valores estão dentro do void)
if(valor > 0 && valor<=this.saldo){
this.saldo-=valor;
        System.out.println("Saque de R$"+valor+" realizado com sucesso.\n Novo saldo: R$"+this.saldo);
}else{
        System.out.println("Saldo insuficiente ou valor  inválido");
}
}

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
