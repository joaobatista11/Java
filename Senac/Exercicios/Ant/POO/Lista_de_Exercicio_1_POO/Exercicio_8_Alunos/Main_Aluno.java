
package Lista_de_Exercicio_1.Exercicio_8_Alunos;

import java.util.Scanner;

public class Main_Aluno {
    public static void main(String[] args) {
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_double = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        Aluno a = new Aluno();
        
        System.out.println("Escreva o nome do(a) aluno(a):");
        a.nome = sc_string.nextLine();
        
        System.out.println("Digite a matricula do(a) aluno(a) "+a.nome+":");
        a.matricula = sc_int.nextInt();
        
        System.out.println("Digite a quantidade de notas:");
        a.q = sc_int.nextInt();
        
        a.notas = new double[a.q];
        
        for (int i = 0; i < a.q; i++) {
            System.out.println((i+1)+". Digite a nota:");
            a.notas[i] = sc_double.nextDouble(); //Erro na sintaxe
        }
        System.out.println("Notas ("+a.q+")");
        for (int i = 0; i < a.q; i++) {
            System.out.println("Nota: "+(i+1)+": "+a.notas[i]);    
        }
        
        System.out.println("\n## Informação do(a) aluno(a) ##\n\nNome: "+a.nome
                + "\nMatricula: "+a.matricula
                +"\nSoma: "+a.calcular_soma()+"\nMédia: "+a.calcular_media());
    
    }
}
