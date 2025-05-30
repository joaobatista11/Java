/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_14_Casa;

/**
 *
 * @author joao_batista
 */
public class Main_Casa {
    public static void main(String[] args) {
 Pessoa proprietario = new Pessoa("João");
 Casa c = new Casa(123, "Azul", proprietario);
 System.out.println("Número da casa: " + c.getNumero());
 System.out.println("Cor da casa: " + c.getCor());
 System.out.println("Proprietário: " +
 c.getProprietario().getNome());
    }
    
}
