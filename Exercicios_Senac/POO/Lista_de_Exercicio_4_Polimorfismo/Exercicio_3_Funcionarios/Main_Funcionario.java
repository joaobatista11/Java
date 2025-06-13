
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_3_Funcionarios;

import java.util.Scanner;

public class Main_Funcionario {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);        
        String gn, vn, dn;
        double gs, vs, ds;
        int gp, vp, dp, vds;
        System.out.println("Gerente\nDigite o nome:");
        gn = sc1.nextLine();
        System.out.println("Digite o salário");
        gs = sc2.nextDouble();
        System.out.println("Digite o aumento (%)");
        gp = sc3.nextInt();
        
        System.out.println("Vendedor\nDigite o nome:");
        vn = sc1.nextLine();
        System.out.println("Digite o salário");
        vs = sc2.nextDouble();
        System.out.println("Digite o aumento (%)");
        vp = sc3.nextInt();       
        System.out.println("Digite a quantidade de vendas");
        vds = sc3.nextInt();

        
        System.out.println("Desenvolvedor\nDigite o nome:");
        dn = sc1.nextLine();
        System.out.println("Digite o salário");
        ds = sc2.nextDouble();
        System.out.println("Digite o aumento (%)");
        dp = sc3.nextInt();
        
        Funcionario g = new Gerente(gn,gs);
        Funcionario v = new Vendedor(vn,vs,vds); 
        Funcionario d = new Desenvolvedor(dn,ds);
        
        System.out.println("Gerente\nAumento: "+gp+"%\nSalário: "+g.calcular_bonus(gp)
                +"\nVendedor\nAumento: "+vp+"%\nSalário: "+v.calcular_bonus(vp)
                +"\nDesenvolvedor\nAumento: "+dp+"%\nSalário: "+d.calcular_bonus(dp));
    }
}
