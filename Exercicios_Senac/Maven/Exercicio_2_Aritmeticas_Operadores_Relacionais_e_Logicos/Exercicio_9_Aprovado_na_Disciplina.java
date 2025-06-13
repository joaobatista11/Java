/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2_Aritmeticas_Operadores_Relacionais_e_Logicos;

import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Exercicio_9_Aprovado_na_Disciplina {
    public static void main(String[] args) {
        Scanner teclacar = new Scanner(System.in);
        Scanner teclanum = new Scanner(System.in);
        System.out.println("Digite a materia?");
        String p = teclacar.nextLine();
        System.out.println("Digite o nome do(a) aluno(a)");
        String a = teclacar.nextLine();        
        System.out.println("Digite a nota do aluno\nA media e 60 e o maximo e 100");
        int n = teclanum.nextInt();
boolean m = (n>=60);
if (m==false){
    System.out.println("Digite a frequencia\nA media e 75 e o maximo e 100");
    int f = teclanum.nextInt();
    System.out.println("O(a) aluno(a) "+a+" foi REPROVADO em "+p);
}else{
    System.out.println("Digite a frequencia\nA media e 75 e o maximo e 100");
    int f = teclanum.nextInt();
boolean k = (f>=75);
if (k==true){
    System.out.println("O(a) aluno(a) "+a+" foi APROVADO em "+p);
}else{
    System.out.println("O(a) aluno(a) "+a+" foi REPROVADO em "+p);

}

}
    }
    
}
