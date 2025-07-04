
package Lista_de_Exercicio_1.Exercicio_3_Carro;

import java.util.Scanner;

public class Main_Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro c = new Carro();
        char ld;
        
        System.out.println("Escreva o nome do modelo do carro:");
        c.modelo = sc.nextLine();
        
        System.out.println("Escreva o nome da marca do carro:");
        c.marca = sc.nextLine();
        
        System.out.println("Digite o ano do carro:");
        c.ano = sc.nextInt();
        
        System.out.println("\n## Informação do carro ##\n\nModelo:"+c.modelo+"\nMarca: "+c.marca+"\nAno:"+c.ano);
        
        
        System.out.println("Ligar o carro? [S/N]");
        ld = sc.next().charAt(0);
        
        if(ld=='S' || ld=='s'){
            c.ligar();
        }
        
        System.out.println("Desligar o carro? [S/N]");
        ld = sc.next().charAt(0);
       
        if(ld=='S' || ld=='s'){
            c.desligar();
        }
    }
}
