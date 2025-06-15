
package Lista_de_Exercicio_5_Herança.Exercicio_13_Usuarios_de_um_sistema;

import java.util.Scanner;

public class Main_Usuarios {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);        
        String n,lo;
        int o;
        System.out.println("Criação de usuários\n\nEscolha\n1 - Administrador\n2 - Editor\n3 - Leitor");
        o = sc_num.nextInt();
        while((o!=1) && (o!=2) && (o!=3)){
        System.out.println("Opção inválida\nEscolha\n1 - Administrador\n2 - Editor\n3 - Leitor");
        o = sc_num.nextInt();
        }
        System.out.println("Digite o nome");
        n = sc_car.nextLine();
        System.out.println("Digite o login");
        lo = sc_car.nextLine();
        
        switch(o){
            case 1 ->{ Administrador a = new Administrador(n,lo);
                a.status();}
            case 2 ->{ Editor e = new Editor(n,lo);
                e.status();}
            case 3 -> { Leitor l = new Leitor(n,lo);
                l.status();}
        }
    }
}
