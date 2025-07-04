/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_5_Produto_Especial;

/**
 *
 * @author joao_batista
 */
public class Main_Produto_Especial {
    public static void main(String[] args) {
        
        Produto_Especial n = new Produto_Especial("Chocolate",4.50,30,10,5);
        
        System.out.println("\n## Informação do produto ##\n\nNome: "+n.nome+"\nPreço: "+n.preco+"\nEstoque: "+n.quantidade_em_estoque
                +"\nVendido: "+n.vendido+"\nLucro: "+n.vender()+"\nReposicionado: "+n.repor+"\nEstoque atual: "+n.repor_estoque());
    }
    
}
