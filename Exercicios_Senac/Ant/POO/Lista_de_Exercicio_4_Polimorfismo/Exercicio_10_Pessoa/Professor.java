/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_10_Pessoa;

/**
 *
 * @author joao_batista
 */
public class Professor extends Pessoa{
private String nome, disciplina;
private int idade;
    @Override
    public String apresentar() {
        return "\nProfessor\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nDisciplina: "+this.getDisciplina();
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
