package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_3_e_20_Carro_Especial;

import java.util.Scanner;

public class Main_Carro_Especial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ld;
        Carro_Especial c1 = new Carro_Especial("Volkswagen","Gol Bolinha",2000);
        
        c1.status();
        
        System.out.println("Ligar o carro? [S/N]");
        ld = sc.next().charAt(0);
       
        if(ld=='S' || ld=='s'){
            c1.ligar();
            c1.status();
        }else{
            System.out.println("O carro continua desligado");
        }
        System.out.println("Acelerar o carro? [S/N]");
        ld = sc.next().charAt(0);
       
        if(ld=='S' || ld=='s'){
            System.out.println(c1.acelerar());
        }    
    }
}
