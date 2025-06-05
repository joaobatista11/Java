
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_6_Dispositivos_Eletrônicos;

public class Celular implements Eletronicos{
private boolean ligada=false;
    @Override
    public void ligar() {
        if(ligada==false){
            ligada=true;
            System.out.println("Ligou");
        }else{
            System.out.println("Já tá ligado");
        }
    }

    @Override
    public void desligar() {
        if(ligada==true){
            ligada=false;
            System.out.println("Desligou");
        }else{
            System.out.println("Já tá desligado");
        }
    }

    @Override
    public void obter_status() {
        System.out.println("\nCelular");
        if(ligada==true){
            System.out.println("Ligado");
        }else{
            System.out.println("Desligado");
        }
    }

    public boolean isLigada() {
        return ligada;
    }

}
