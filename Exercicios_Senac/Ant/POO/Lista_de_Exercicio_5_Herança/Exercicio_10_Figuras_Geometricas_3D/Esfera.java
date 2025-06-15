
package Lista_de_Exercicio_5_Herança.Exercicio_10_Figuras_Geometricas_3D;

public class Esfera extends Figura{
private double raio;
    @Override
    public double calcular_volume() {
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
