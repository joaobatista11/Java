/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_1.Exercicio_9_Produto;

/**
 *
 * @author joao_batista
 */
public class Produto {
String nome;
double preco, soma_venda;
int quantidade_em_estoque, vendido, repor;

double vender(){
    quantidade_em_estoque -= vendido;
    for (int i = 1; i <= vendido; i++) {
        soma_venda+=preco;
    }
  
    
    
    return soma_venda;

}
int repor_estoque(){
    quantidade_em_estoque += repor;
    
    
    return quantidade_em_estoque;

}
}
