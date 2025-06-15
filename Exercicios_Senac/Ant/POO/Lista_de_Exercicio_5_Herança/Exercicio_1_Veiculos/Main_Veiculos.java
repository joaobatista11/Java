
package Lista_de_Exercicio_5_Herança.Exercicio_1_Veiculos;

import java.util.Scanner;

public class Main_Veiculos {
    public static void main(String[] args) {
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);      
        String crmo, crma, mtmo, mtma, cmmo, cmma;
        int cra, mta, cma, crqp, mtcl, cmcc;
        System.out.println("Carro\nEscreva o modelo");
        crmo = sc_string.nextLine();
        System.out.println("Escreva a marca");
        crma = sc_string.nextLine();
        System.out.println("Digite o ano");
        cra = sc_int.nextInt();
      
        System.out.println("Digite a quantidade de portas");
        crqp = sc_int.nextInt();
      
        System.out.println("\nMoto\nEscreva o modelo");
        mtmo = sc_string.nextLine();
        System.out.println("Escreva a marca");
        mtma = sc_string.nextLine();
        System.out.println("Digite o ano");
        mta = sc_int.nextInt();

        System.out.println("Digite as cilindradas");
        mtcl = sc_int.nextInt();
        
        System.out.println("\nCaminhão\nEscreva o modelo");
        cmmo = sc_string.nextLine();
        System.out.println("Escreva a marca");
        cmma = sc_string.nextLine();
        System.out.println("Digite o ano");
        cma = sc_int.nextInt();

        System.out.println("Digite a capacidade de carga");
        cmcc = sc_int.nextInt();
        
        Carro cr = new Carro(crma,crmo,cra,crqp);
        Moto mt = new Moto(mtma,mtmo,mta,mtcl);
        Caminhao cm = new Caminhao(cmma,cmmo,cma,cmcc);
        cr.status();
        mt.status();
        cm.status();
        
        
    }
}
