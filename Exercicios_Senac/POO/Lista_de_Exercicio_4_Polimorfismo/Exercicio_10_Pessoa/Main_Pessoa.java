/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_4_Polimorfismo.Exercicio_10_Pessoa;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);
        String an, pn, fn, pd, fc;
        int ai, pi, fi, at;
        System.out.println("Aluno:\nDigite o nome");
        an = sc_car.nextLine();
        System.out.println("Digite a idade");
        ai = sc_num.nextInt();
        System.out.println("Digite a turma");
        at = sc_num.nextInt();
        
        System.out.println("\nProfessor:\nDigite o nome");
        pn = sc_car.nextLine();
        System.out.println("Digite a idade");
        pi = sc_num.nextInt();
        System.out.println("Digite a disciplina");
        pd = sc_car.nextLine();
        
        System.out.println("\nFuncionário:\nDigite o nome");
        fn = sc_car.nextLine();
        System.out.println("Digite a idade");
        fi = sc_num.nextInt();
        System.out.println("Digite o cargo");
        fc = sc_car.nextLine();
        
        Aluno a = new Aluno();
        a.setNome(an);
        a.setIdade(ai);
        a.setTurma(at);
        
        Professor p = new Professor();
        p.setNome(pn);
        p.setIdade(pi);
        p.setDisciplina(pd);
        
        Funcionario f = new Funcionario();
        f.setNome(fn);
        f.setIdade(fi);
        f.setCargo(fc);
        
        System.out.println(a.apresentar());
        System.out.println(p.apresentar());
        System.out.println(f.apresentar());

    }
    
}
