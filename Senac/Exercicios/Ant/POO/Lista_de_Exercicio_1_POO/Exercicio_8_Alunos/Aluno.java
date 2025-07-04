
package Lista_de_Exercicio_1.Exercicio_8_Alunos;

public class Aluno {
        String nome;
        int matricula, q;
        double[] notas = new double[q];
        double soma = 0, media;
        
        double calcular_soma(){
            soma = 0;
            for (int i = 0; i < q; i++) {
                soma+=notas[i];    
            }
            return soma;
        }
        
        double calcular_media(){
             return soma/q;
            
           
        }
    
}
