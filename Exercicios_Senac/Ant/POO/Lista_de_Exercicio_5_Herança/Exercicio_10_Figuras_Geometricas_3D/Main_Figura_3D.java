
package Lista_de_Exercicio_5_Herança.Exercicio_10_Figuras_Geometricas_3D;

import java.util.Scanner;

public class Main_Figura_3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cubo cb = new Cubo();
        Cilindro cl = new Cilindro();
        Esfera es = new Esfera();
        double a, r1, h, r2;
        System.out.println("Cubo\nDigite a área");
        a = sc.nextDouble();
        cb.setArea(a);
        
        System.out.println("Cilíndro\nDigite o raio");
        r1 = sc.nextDouble();
        cl.setRaio(r1);
        System.out.println("Digite a altura");
        h = sc.nextDouble();        
        cl.setAltura(h);
        
        System.out.println("Esfera\nDigite o raio");
        r2 = sc.nextDouble();
        es.setRaio(r2);        
        
        System.out.println("\nCubo\nVolume: "+cb.calcular_volume()
                +"\n\nCilindro\nVolume: "+cl.calcular_volume()
                +"\n\nEsfera\nVolume: "+es.calcular_volume());       
    }
}
