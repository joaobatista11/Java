/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_10_Pessoa;

/**
 *
 * @author joao_batista
 */
public class Aluno extends Pessoa{
private String nome;
private int idade, turma;
    @Override
    public String apresentar() {
        return "\nAluno\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nTurma: "+this.getTurma();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getTurma() {
        return turma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
    
}
