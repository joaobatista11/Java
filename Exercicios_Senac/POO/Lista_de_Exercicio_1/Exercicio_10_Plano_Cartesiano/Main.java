
package Lista_de_Exercicio_1.Exercicio_10_Plano_Cartesiano;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cartesiano ponto1 = new Cartesiano();
        Cartesiano ponto2 = new Cartesiano();
        
        System.out.println("Digite as coordenadas do primeiro ponto: ");
        System.out.println("X:");
        ponto1.x = sc.nextInt();
        System.out.println("Y:");
        ponto1.y = sc.nextInt();
        
        System.out.println("Digite as coordenadas do segundo ponto: ");
        System.out.println("X:");
        ponto2.x = sc.nextInt();
        System.out.println("Y:");
        ponto2.y = sc.nextInt();
        
        //Calcular e exibir a distância
        double distancia = ponto1.calcular_distancia(ponto2);
            System.out.println("A distância entre os ponto é: "+distancia);
    }
}
