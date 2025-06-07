
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_1_Formas_Geométricas;

public class Triangulo extends Forma{
private double altura, base;
    
@Override
    public double Calcular_Area() {
        return (base * altura)/2;  
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
