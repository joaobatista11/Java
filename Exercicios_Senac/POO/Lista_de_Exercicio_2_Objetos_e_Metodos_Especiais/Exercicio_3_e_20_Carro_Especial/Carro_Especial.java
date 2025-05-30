
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_3_e_20_Carro_Especial;

public class Carro_Especial {
String marca, modelo;
int ano;
boolean ligado;
    
    public Carro_Especial(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.setLigado(false);
    }

    public void status(){
        System.out.println("\n## Informação do carro ##\n\nModelo:"+this.modelo
                +"\nMarca: "+this.marca+"\nAno:"+this.ano);
        if(this.ligado==false){
            System.out.println("O carro está desligado");
        }
    }
    
public void ligar(){
if(ligado=true){
    System.out.println("O carro "+modelo+" ligou");
}else{
    System.out.println("O carro "+modelo+" já tá ligado");
}
}

public void desligar(){
if(ligado=false){
    System.out.println("O carro "+modelo+" desligou");
}else{
    System.out.println("O carro "+modelo+" já tá desligado");
}
}

public String acelerar(){
    if(ligado==true){
        return "Acelerando o carro";
    }else{
        return "O carro está desligado";
    }
}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



}
