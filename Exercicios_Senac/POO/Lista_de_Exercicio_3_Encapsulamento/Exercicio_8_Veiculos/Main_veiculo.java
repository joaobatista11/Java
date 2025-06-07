
package Lista_de_Exercicio_3_Encapsulamento.Exercicio_8_Veiculos;

import java.util.Scanner;

public class Main_veiculo {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);
        int v, dv, a, i=0;
        String e="esquerda",d="direita";
        Carro c = new Carro();
        Moto m = new Moto();
        Bicicleta b = new Bicicleta();                    
        Veiculo[] obj = new Veiculo[3];
        obj[0] = c;
        obj[1] = m;        
        obj[2] = b;

        
        
        System.out.println("Escolha um veiculo\n1 - Carro\n2 - Moto\n3 - Bicicleta");
        v = sc_num.nextInt();                
        while(v<1 || v>3){
        System.out.println("Opcão inválida\nEscolha um veiculo\n1 - Carro\n2 - Moto\n3 - Bicicleta");
        v = sc_num.nextInt();        
        }
        switch(v){
            case 1 ->{System.out.println("Carro escolhido");
            }
//                Carro c = new Carro();}
            case 2 ->{System.out.println("Moto escolhido");
            i=1;}
//                Moto m = new Moto();}
            case 3 ->{System.out.println("Bicicleta escolhido");
            i=2;}
//                Bicicleta b = new Bicicleta();}            
        }
        do{        
        System.out.println("\nEscolha um ação\n1 - Acelerar\n2 - Frear\n3 - Virar");
        a = sc_num.nextInt();
        while(a<1 || a>3){
        System.out.println("\nOpcão inválida\nEscolha um ação\n1 - Acelerar\n2 - Frear\n3 - Virar");
        a = sc_num.nextInt();
        }
            switch(a){
                case 1 ->{System.out.println(obj[i].acelerar());}
                case 2 ->{System.out.println(obj[i].frear());}
                case 3 ->{System.out.println("\nEscolha a direção\n1 - Esquerda\n2 - Direita");
                dv = sc_num.nextInt();
                while(dv<1 || dv>2){
               System.out.println("\nDireção inválida\nEscolha a direção\n1 - Esquerda\n2 - Direita");
                dv = sc_num.nextInt();
                }
                if(dv==1){
                    System.out.println(obj[i].virar(e));
                }else if (dv==2){
                    System.out.println(obj[i].virar(d));                
                }
                
            }
        }    
    }while(a!=2);
}
}
