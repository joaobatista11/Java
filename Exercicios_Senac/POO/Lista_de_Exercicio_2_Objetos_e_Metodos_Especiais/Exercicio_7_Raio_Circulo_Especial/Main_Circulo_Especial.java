
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_7_Raio_Circulo_Especial;

public class Main_Circulo_Especial {
    public static void main(String[] args) {
       Circulo_Especial n = new Circulo_Especial(15);
        n.calcular_raio();
        n.calcular_circuferencia();
        System.out.println("Raio: "+n.rsltd_raio+"\nCircuferência: "+n.rsltd_circ);
    }
}
