/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_3_Funcionario;

/**
 *
 * @author joao_batista
 */
public class Vendedor extends Funcionario{
private String comissao;

    public Vendedor(String nome, String cargo, double salario, String comissao) {
        super(nome, cargo, salario);
        this.comissao = comissao;
    }
    public void status(){
        System.out.println("\nVendedor\nNome: "+this.getNome()+"\nCargo: "+this.getCargo()
                +"\nSalário: "+this.getSalario()+"\nDepartamento: "+this.comissao);
    }
}
