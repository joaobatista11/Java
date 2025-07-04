
package Lista_de_Exercicio_1.Exercicio_5_Raio_Circulo;

import java.util.Scanner;

public class Main_Circulo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Circulo n = new Circulo();
        System.out.println("Digite o raio do círculo:");
        n.raio = sc.nextDouble();
        n.calcular_raio();
        n.calcular_circuferencia();
        System.out.println("Raio: "+n.rsltd_raio+"\nCircuferência: "+n.rsltd_circ);
    }
}
