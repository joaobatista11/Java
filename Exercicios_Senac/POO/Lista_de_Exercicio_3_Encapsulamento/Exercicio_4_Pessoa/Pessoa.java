/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_1.Lista_de_Exercicio_3_Encapsulamento.Exercicio_4_Pessoa;

/**
 *
 * @author joao_batista
 */
public class Pessoa implements Comparable <Pessoa> { // Criar uma interface dentro da classe. Comparable: palavra chave do Java
    private String nome; // private. precisa usar get no main porque não pode usar direto
    private int idade;

    // Precisa de construtor (caso crie uma interface dentro da classe)
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.idade, o.idade); // this.idade(construtor) - o.idade(objeto)
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


    
}
