
package Exercicio_11_Metodo_Facil;

import java.util.Scanner;

public class Exercicio_4_Coversor_de_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Digite um numero");
        c = sc.nextInt();
        Fahrenheit(c);
    }

    private static double Fahrenheit(int c) {
        double f;
        f=(c*9/5)+32;
        System.out.println(f);
        return 0;
    }
}
