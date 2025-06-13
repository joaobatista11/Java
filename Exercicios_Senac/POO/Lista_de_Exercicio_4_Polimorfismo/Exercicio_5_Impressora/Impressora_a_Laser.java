
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_5_Impressora;

public class Impressora_a_Laser extends Impressora{

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo com a impressora a laser\n\n"+documento+"\n");
    }

}
