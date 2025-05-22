
package Lista_de_Exercicio_1.Exercicio_4_Retangulo;

import java.util.Scanner;

public class Main_Retangulo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Retangulo n = new Retangulo();
        System.out.println("Digite a base do retângulo");
        n.base = sc.nextDouble();
        System.out.println("Digite a altura do retângulo");
        n.altura = sc.nextDouble();
        n.calcular_area();
        n.calcular_perimetro();
        System.out.println("Área: "+n.resultado_area+"\nPerímeto: "+n.resultado_perimeto);
    }
}
