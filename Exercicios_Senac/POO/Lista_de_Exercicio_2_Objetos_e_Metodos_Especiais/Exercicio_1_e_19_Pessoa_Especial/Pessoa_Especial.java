
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_1_e_19_Pessoa_Especial;

public class Pessoa_Especial {
        private String nome;
        private int idade;
        private double altura;


    public Pessoa_Especial(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
        
        public void status(){
        System.out.println("Ola, meu nome e "+nome+",\nTenho "+idade+" anos e\nTenho "+altura+" metros de altura.");
    }        

    @Override
    public String toString() {
        return "Pessoa_Especial{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }   
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
