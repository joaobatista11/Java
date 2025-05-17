
package Lista_de_Exercicio_1.Exercicio_2_Conta_Bancaria;

public class Main_Conta_Bancaria {
    public static void main(String[] args) {
        Conta_Bancaria conta1 = new Conta_Bancaria();
        conta1.numero_conta = "12345-6";
        conta1.titular = "Brayan";
        conta1.saldo = 20.0;
        
        conta1.depositar(200.0);
        conta1.sacar(50);
    }
}
