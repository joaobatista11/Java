
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_7_Raio_Circulo_Especial;

public class Circulo_Especial {
double raio, rsltd_raio, rsltd_circ;

    public Circulo_Especial(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRsltd_raio() {
        return rsltd_raio;
    }

    public void setRsltd_raio(double rsltd_raio) {
        this.rsltd_raio = rsltd_raio;
    }

    public double getRsltd_circ() {
        return rsltd_circ;
    }

    public void setRsltd_circ(double rsltd_circ) {
        this.rsltd_circ = rsltd_circ;
    }

void calcular_raio(){
rsltd_raio = Math.PI * Math.pow(raio,2);
}
void calcular_circuferencia(){
rsltd_circ = 2 * Math.PI * raio; 
}
}
