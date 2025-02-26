
package exercicios_1_Basico;

import java.util.Scanner;

public class Exercicio_8_Desconto_do_Produto {
    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        System.out.print("Digite o valor do produto R$");
        double n = tecla.nextDouble();
        double r = n*(0.95);
        System.out.println("O valor descontado e: R$"+ String.format("%.2f", r));
    }
    
}
