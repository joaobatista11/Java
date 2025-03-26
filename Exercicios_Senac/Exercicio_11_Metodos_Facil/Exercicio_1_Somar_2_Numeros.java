
package Exercicio_11_Metodo_Facil;

import java.util.Scanner;

public class Exercicio_1_Somar_2_Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,r;
        System.out.println("Digite o primeiro numero");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = sc.nextInt();
        r=s(n1,n2);
        System.out.println(r);
    }

    public static int s(int n1, int n2) {
    int s1;
    s1=n1+n2;
    return s1;
    }
}
