/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_7_Pessoas;

/**
 *
 * @author joao_batista
 */
public class Professor extends Pessoa{
private String disciplina; 

    public Professor(String nome, String endereco, int idade, String disciplina) {
        super(nome, endereco, idade);
        this.disciplina = disciplina;
    }
    public void status(){
        System.out.println("\nProfessor\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nEndereço: "+this.getEndereco()
                +"\nDisciplina: "+this.getDisciplina());
    }
    
    public String getDisciplina() {
        return disciplina;
    }

}
