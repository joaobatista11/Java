
package Lista_de_Exercicio_5_Herança.Exercicio_10_Figuras_Geometricas_3D;

public class Cilindro extends Figura{
private double raio, altura;
    @Override
    public double calcular_volume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
