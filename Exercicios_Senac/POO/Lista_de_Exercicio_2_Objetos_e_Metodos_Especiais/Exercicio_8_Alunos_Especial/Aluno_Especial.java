
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_8_Alunos_Especial;

public class Aluno_Especial {
        String nome;
        int matricula, q;
        double[] notas = new double[q];
        double soma = 0, media;

    public Aluno_Especial(String nome, int matricula, int q) {
        this.nome = nome;
        this.matricula = matricula;
        this.q = q;
    }

    public void status(){
        System.out.println("##Informação do aluno ##\n\nNome: "+this.nome+"\nMatricula: "+this.matricula+"\nQuantidade de notas: "+this.q+"\n");
    }
    
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
 
        
        
}
