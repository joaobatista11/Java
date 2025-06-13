
package CRUD_Avaliativo;


import java.util.Scanner;

public class Main_CRUD {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);
        
        Inserir i = new Inserir();
        //Atualizar a = new Atualizar();
        Deletar_Um du = new Deletar_Um();
        Deletar_Tudo dt = new Deletar_Tudo();
        Deletar_Grupo dg = new Deletar_Grupo();                
        Consultar_Um cu = new Consultar_Um();
        Consultar_Tudo ct = new Consultar_Tudo();        
        Consultar_Grupo cg = new Consultar_Grupo();        
        Criar_Tabela t = new Criar_Tabela();
                int o;
                String n, g;
        t.criar();

        o = -1;
        while(o != 0){
            System.out.println("\n## Menu CRUD animais ##\n1. Inserir\n2. Deletar um\n3. Deletar grupo\n4. Deletar tudo\n5. Consultar um\n6. Consultar grupo\n7. Consultar tudo\n0. Sair");
        o = sc_num.nextInt();
        switch(o){
            case 1 ->{System.out.println("Nome");
            n = sc_car.nextLine();
                System.out.println("Grupo");
                g = sc_car.nextLine();
                i.inserir(n, g);
            }
            case 2 ->{System.out.println("Nome do animal para deletar");
            n = sc_car.nextLine();
                du.deletar_um(n);
            }
            case 3 ->{System.out.println("Nome do grupo para deletar:");
            g = sc_car.nextLine();
            dg.deletar_grupo(g);
            }
            case 4 ->{dt.deletar_tudo();}
                        
            case 5 ->{System.out.println("Digite o nome");
                n = sc_car.nextLine();
                cu.consultar_um(n);}
            case 6 ->{System.out.println("Digite o grupo");
                g = sc_car.nextLine();
                cg.consultar_grupo(g);}
            case 7 ->{ct.consultar_tudo();}            
            case 0 ->{System.out.println("Encerrando o programa ...");}
            default -> {System.out.println("Opção inválida");}
        }
        }
    }
}
