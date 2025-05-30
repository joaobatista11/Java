
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_2_e_18_Conta_Bancaria_Especial;

public class Main_Conta_Bancaria_Especial {
    public static void main(String[] args) {
        Conta_Bancaria_Especial conta1 = new Conta_Bancaria_Especial("12345-6","Brayan",20.0);
        conta1.status();
        conta1.depositar(200.0);
        conta1.sacar(50);   
    }
}
