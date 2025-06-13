/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_10_Pessoa;

/**
 *
 * @author joao_batista
 */
public class Funcionario extends Pessoa{
private String nome, cargo;
private int idade;    

    @Override
    public String apresentar() {
    return "\nFuncionário\nNome: "+this.getNome()
                +"\nIdade: "+this.getIdade()
                +"\nCargo: "+this.getCargo();
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
