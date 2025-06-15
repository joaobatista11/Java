/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_3_Funcionario;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Funcionario {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);        
        String gn, gc, gd, vn, vc, vcm, dn, dc, dl;
        double gs, vs, ds;
        System.out.println("Gerente\nDigite o nome");
        gn = sc_car.nextLine();
        System.out.println("Digite o cargo");
        gc = sc_car.nextLine();
        System.out.println("Digite o salário");
        gs = sc_num.nextDouble();
        
        System.out.println("Digite o departamento");
        gd = sc_car.nextLine();
        
        System.out.println("\nVendedor\nDigite o nome");
        vn = sc_car.nextLine();
        System.out.println("Digite o cargo");
        vc = sc_car.nextLine();
        System.out.println("Digite o salário");
        vs = sc_num.nextDouble();

        System.out.println("Digite a comissão");
        vcm = sc_car.nextLine();
        
        System.out.println("\nDesenvolvedor\nDigite o nome");
        dn = sc_car.nextLine();
        System.out.println("Digite o cargo");
        dc = sc_car.nextLine();
        System.out.println("Digite o salário");
        ds = sc_num.nextDouble();

        System.out.println("Digite a linguagem de programação");
        dl = sc_car.nextLine();
        
        Gerente g = new Gerente(gn,gc,gs,gd);
        Vendedor v = new Vendedor(vn,vc,vs,vcm);
        Desenvolvedor d = new Desenvolvedor(dn,dc,ds,dl);
        
        g.status();
        v.status();
        d.status();
        
    }
    
}
