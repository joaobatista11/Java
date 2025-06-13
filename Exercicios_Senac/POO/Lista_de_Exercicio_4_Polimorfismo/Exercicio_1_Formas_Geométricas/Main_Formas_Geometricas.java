
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_1_Formas_Geométricas;

import java.util.Scanner;

public class Main_Formas_Geometricas {
    public static void main(String[] args) {
        // System.out.printf("%.2.f%n");
        Scanner sc = new Scanner(System.in);
        double cr,rb,ra,tb,ta;
        System.out.println("Círculo\nDigite o raio:");
        cr = sc.nextDouble();
        
        System.out.println("Retângulo\nDigite a base:");
        rb = sc.nextDouble();
        System.out.println("Digite a altura:");
        ra = sc.nextDouble();
        
        System.out.println("Triângulo\nDigite a base:");
        tb = sc.nextDouble();
        System.out.println("Digite a altura:");
        ta = sc.nextDouble();        
    
        Circulo c = new Circulo();
        c.setRaio(cr);
        
        Retangulo r = new Retangulo();
        r.setAltura(ra);
        r.setBase(rb);
        
        Triangulo t = new Triangulo();
        t.setAltura(ta);
        t.setBase(tb);
        
        System.out.println("Área\nCírculo: "+c.Calcular_Area()+"\nRetângulo: "+r.Calcular_Area()
        +"\nTriângulo: "+t.Calcular_Area());
    }
}
