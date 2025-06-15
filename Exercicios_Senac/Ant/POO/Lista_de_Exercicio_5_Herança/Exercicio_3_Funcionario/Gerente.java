/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_3_Funcionario;

/**
 *
 * @author joao_batista
 */
public class Gerente extends Funcionario{
private String departamento;

    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }
    public void status(){
        System.out.println("\nGerente\nNome: "+this.getNome()+"\nCargo: "+this.getCargo()
                +"\nSalário: "+this.getSalario()+"\nDepartamento: "+this.departamento);
    }
}
