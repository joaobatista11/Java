
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_6_Retangulo_Especial;

public class Main_Retangulo_Especial {
    public static void main(String[] args) {
       Retangulo_Especial n = new Retangulo_Especial(4,2);
        n.calcular_area();
        n.calcular_perimetro();
        System.out.println("Área: "+n.resultado_area+"\nPerímeto: "+n.resultado_perimeto);
    }
}
