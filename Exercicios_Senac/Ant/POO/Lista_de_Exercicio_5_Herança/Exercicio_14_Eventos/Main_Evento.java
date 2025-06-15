
package Lista_de_Exercicio_5_Herança.Exercicio_14_Eventos;

import java.util.Scanner;

public class Main_Evento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sn, sd, sa, pn, pd, pp, wn, wd, wt; 
        System.out.println("Show\nDigite o nome:");
        sn = sc.nextLine();
        System.out.println("Digite a data:");
        sd = sc.nextLine();
        
        System.out.println("Digite o nome do artista");
        sa = sc.nextLine();
        
        System.out.println("Palestra\nDigite o nome:");
        pn = sc.nextLine();
        System.out.println("Digite a data:");
        pd = sc.nextLine();

        System.out.println("Digite o nome do palestrante");
        pp = sc.nextLine();
        
        System.out.println("Workshop\nDigite o nome:");
        wn = sc.nextLine();
        System.out.println("Digite a data:");
        wd = sc.nextLine();        
         
        System.out.println("Digite o tema");
        wt = sc.nextLine();
        
        Show s = new Show(sn,sd,sa);
        Palestra p = new Palestra(pn,pd,pp);
        Workshop w = new Workshop(wn,wd,wt);
        
        s.status();
        p.status();
        w.status();
    }
}
