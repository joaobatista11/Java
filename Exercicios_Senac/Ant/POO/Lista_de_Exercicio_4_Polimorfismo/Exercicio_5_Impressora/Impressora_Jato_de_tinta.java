
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_5_Impressora;

public class Impressora_Jato_de_tinta extends Impressora{

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo com a impressora jato de tinta\n\n"+documento+"\n");
    }

}
