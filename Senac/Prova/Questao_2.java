
package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
 ArrayList<String>lista = new ArrayList<>();       
    Scanner sc = new Scanner(System.in);
    String n;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+". Escreva um nome de um aluno");    
            n= sc.nextLine();
            if(n.length()>=6){
            lista.add(n);
            }
            
        }
        System.out.println("\nLista de alunos que tem mais de 6 caracteres:");
        for(String alunos: lista){
            System.out.println(alunos);
            }
    }
}
