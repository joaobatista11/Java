package Exercicio_5_While;

import java.util.Scanner;

public class Exercicio_1_Calculadora_media_de_idades {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int c = 1, s = 0;
        System.out.println("Digite a idade do(a) aluno(a) " + c);
        int n = tecla.nextInt();
        while (n > 1) {
            c++;
            System.out.println("Digite a idade do(a) aluno(a) " + c);
            n = tecla.nextInt();
            s += n;
        }
        if (n < 1) {
            c--;
            s--;
        }
        double m = s / c;
        System.out.println("Numeros de alunos(as) na turma " + c + "\nA soma das idades da turma e: " + s + "\nA media das idades da turma e: " + m);
    }
}
