
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_6_Dispositivos_Eletrônicos;

public class Televisao implements Eletronicos{
private boolean ligada=false;
    @Override
    public void ligar() {
        if(ligada==false){
            ligada=true;
            System.out.println("Ligou");
        }else{
            System.out.println("Já tá ligada");
        }
    }

    @Override
    public void desligar() {
        if(ligada==true){
            ligada=false;
            System.out.println("Desligou");
        }else{
            System.out.println("Já tá desligada");
        }
    }

    @Override
    public void obter_status() {
        System.out.println("\nTelevisão");
        if(ligada==true){
            System.out.println("Ligada");
        }else{
            System.out.println("Desligada");
        }
    }

    public boolean isLigada() {
        return ligada;
    }

}
