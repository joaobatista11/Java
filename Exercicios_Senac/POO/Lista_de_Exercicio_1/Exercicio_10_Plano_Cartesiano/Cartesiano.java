
package Lista_de_Exercicio_1.Exercicio_10_Plano_Cartesiano;

public class Cartesiano {
int x, y;

double calcular_distancia(Cartesiano outro_ponto){ // parâmetro do tipo da classe
int deltax = x - outro_ponto.x;
int deltay = y - outro_ponto.y;
return Math.sqrt(deltax * deltax + deltay * deltay);
}    
}
