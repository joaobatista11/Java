
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_8_Alunos_Especial;

import java.util.Scanner;

public class Main_Aluno_Especial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno_Especial a = new Aluno_Especial("Jucelino",87689,5);
        a.status();
        a.notas = new double[a.q];
        
        for (int i = 0; i < a.q; i++) {
            System.out.println((i+1)+". Digite a nota:");
            a.notas[i] = sc.nextDouble();
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
