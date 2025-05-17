
package Lista_de_Exercicio_1.Exercicio_2_Conta_Bancaria;

public class Conta_Bancaria {
String numero_conta, titular;
double saldo;

void depositar (double valor){ // variavel com parâmetro. Valor = Depositar (variavel vazia)
saldo += valor;
        System.out.println("Depósito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+saldo);
        }

void sacar(double valor){ // Valor = Sacar. valor sacar != valor depositar (porque os valores estão dentro do void)
if(valor<=saldo){
saldo-=valor;
        System.out.println("Saque de R$"+valor+" realizado com sucesso.\n Novo saldo: R$"+saldo);
}else{
        System.out.println("Saldo para saque");
}
}
}
