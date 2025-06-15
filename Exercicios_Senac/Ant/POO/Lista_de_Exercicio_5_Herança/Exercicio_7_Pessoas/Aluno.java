/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_7_Pessoas;

/**
 *
 * @author joao_batista
 */
public class Aluno extends Pessoa{
private int matricula;   

    public Aluno(String nome, String endereco, int idade, int matricula) {
        super(nome, endereco, idade);
        this.matricula = matricula;
    }

    public void status(){
        System.out.println("\nAluno\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nEndereço: "+this.getEndereco()
                +"\nMatricula: "+this.getMatricula());
    }
    
    public int getMatricula() {
        return matricula;
    }

}
