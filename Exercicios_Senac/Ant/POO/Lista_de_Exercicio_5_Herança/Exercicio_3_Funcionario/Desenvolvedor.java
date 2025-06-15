/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_3_Funcionario;

/**
 *
 * @author joao_batista
 */
public class Desenvolvedor extends Funcionario{
private String linguagem_de_programacao;    

    public Desenvolvedor(String nome, String cargo, double salario, String linguagem_de_programacao) {
        super(nome, cargo, salario);
        this.linguagem_de_programacao = linguagem_de_programacao;
    }
    public void status(){
        System.out.println("\nDesenvolvedor\nNome: "+this.getNome()+"\nCargo: "+this.getCargo()
                +"\nSalário: "+this.getSalario()+"\nDepartamento: "+this.linguagem_de_programacao);
    }
}
