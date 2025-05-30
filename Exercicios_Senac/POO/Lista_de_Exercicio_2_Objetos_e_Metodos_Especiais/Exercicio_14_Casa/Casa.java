/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_14_Casa;

/**
 *
 * @author joao_batista
 */
 class Pessoa {
 private String nome;

 public Pessoa(String nome) {
 this.nome = nome;
 }

 // Getter e Setter para nome
 public String getNome() {
 return this.nome;
 }

 public void setNome(String nome) {
 this.nome = nome;
 }

 }

 class Casa {
 private int numero;
 private String cor;
 private Pessoa proprietario;

 public Casa(int numero, String cor, Pessoa proprietario) {
 this.numero = numero;
 this.cor = cor;
 this.proprietario = proprietario;
 }

 // Getters
 public int getNumero() {
 return this.numero;
 }

 public String getCor() {
 return this.cor;
 }

 public Pessoa getProprietario() {
 return this.proprietario;
 }

 // Setters
 public void setNumero(int numero) {
 this.numero = numero;
 }

 public void setCor(String cor) {
 this.cor = cor;
 }

 public void setProprietario(Pessoa proprietario) {
 this.proprietario = proprietario;
 }
 }
