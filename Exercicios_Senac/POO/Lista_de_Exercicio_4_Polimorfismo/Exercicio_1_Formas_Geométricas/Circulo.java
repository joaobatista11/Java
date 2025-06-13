
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_1_Formas_Geométricas;

public class Circulo extends Forma{
double raio;
    @Override
    public double Calcular_Area() {
        return Math.PI * Math.pow(raio,2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
