
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_6_Retangulo_Especial;

public class Retangulo_Especial {
double base, altura, resultado_area, resultado_perimeto;

    public Retangulo_Especial(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }



void calcular_area(){
resultado_area = base * altura;
}

void calcular_perimetro(){ 
resultado_perimeto = (base*2)+(altura*2);



}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado_area() {
        return resultado_area;
    }

    public void setResultado_area(double resultado_area) {
        this.resultado_area = resultado_area;
    }

    public double getResultado_perimeto() {
        return resultado_perimeto;
    }

    public void setResultado_perimeto(double resultado_perimeto) {
        this.resultado_perimeto = resultado_perimeto;
    }
}
