
package Lista_de_Exercicio_1.Exercicio_3_Carro;

public class Carro {
String marca, modelo;
int ano;
boolean ligado=false;

void ligar(){
if(ligado=true){
    System.out.println("O carro "+modelo+" ligou");
}else{
    System.out.println("O carro "+modelo+" já tá ligado");
}
}

void desligar(){
if(ligado=false){
    System.out.println("O carro "+modelo+" desligou");
}else{
    System.out.println("O carro "+modelo+" já tá desligado");
}
}

}
