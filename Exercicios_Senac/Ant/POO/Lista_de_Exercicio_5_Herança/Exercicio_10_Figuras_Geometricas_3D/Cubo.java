
package Lista_de_Exercicio_5_Herança.Exercicio_10_Figuras_Geometricas_3D;

public class Cubo extends Figura{
private double area;
    @Override
    public double calcular_volume() {
        return Math.pow(area, 3);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
