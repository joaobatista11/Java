
package Lista_de_Exercicio_5_Herança.Exercicio_2_Animais;

import java.util.Scanner;

public class Main_Animal {
    public static void main(String[] args) {
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_number = new Scanner(System.in);        
        String mn,  mp, an,  rn,  re;
        int mi, ai, ri;
        double ae;
        
        System.out.println("Mamífero\nDigite o nome");
        mn = sc_string.nextLine();
        System.out.println("Digite a idade");
        mi = sc_number.nextInt();
        
        System.out.println("Digite o tipo de pelo");
        mp = sc_string.nextLine();
        
        System.out.println("Ave\nDigite o nome");
        an = sc_string.nextLine();
        System.out.println("Digite a idade");
        ai = sc_number.nextInt();        
        
        System.out.println("Digite a envergadura da asa");
        ae = sc_number.nextDouble();
        
        System.out.println("Réptil\nDigite o nome");
        rn = sc_string.nextLine();
        System.out.println("Digite a idade");
        ri = sc_number.nextInt();

        System.out.println("Digite o tipo de escama");
        re = sc_string.nextLine();
        
        Mamifero m = new Mamifero(mn,mi,mp);
        Ave a = new Ave(an,ai,ae);
        Reptil r = new Reptil(rn,ri,re);
        
        m.status();
        a.status();
        r.status();
    }
}
