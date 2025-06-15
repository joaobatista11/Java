/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_7_Pessoas;

/**
 *
 * @author joao_batista
 */
public class Funcionario extends Pessoa{
private String cargo;    

    public Funcionario(String nome, String endereco, int idade, String cargo) {
        super(nome, endereco, idade);
        this.cargo = cargo;
    }
    public void status(){
        System.out.println("\nFuncionário\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nEndereço: "+this.getEndereco()
                +"\nCargo: "+this.getCargo());
    }
    
    public String getCargo() {
        return cargo;
    }

}
