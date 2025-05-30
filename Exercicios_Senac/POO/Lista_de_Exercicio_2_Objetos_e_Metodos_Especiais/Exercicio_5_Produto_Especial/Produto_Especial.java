/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_5_Produto_Especial;

/**
 *
 * @author joao_batista
 */
public class Produto_Especial {
String nome;
double preco;
int quantidade_em_estoque, vendido, repor;

    public Produto_Especial(String nome, double preco, int quantidade_em_estoque, int vendido, int repor) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade_em_estoque = quantidade_em_estoque;
        this.vendido = vendido;
        this.repor = repor;
    }

double vender(){
    quantidade_em_estoque -= vendido;
    double soma_venda=0;
    for (int i = 1; i <= vendido; i++) {
        soma_venda+=preco;
    }
  
    return soma_venda;

}
int repor_estoque(){
    quantidade_em_estoque += repor;
    return quantidade_em_estoque;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getQuantidade_em_estoque() {
        return quantidade_em_estoque;
    }

    public void setQuantidade_em_estoque(int quantidade_em_estoque) {
        this.quantidade_em_estoque = quantidade_em_estoque;
    }

    public int getVendido() {
        return vendido;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }

    public int getRepor() {
        return repor;
    }

    public void setRepor(int repor) {
        this.repor = repor;
    }
}
