/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_de_Exercicio_5_Herança.Exercicio_7_Pessoas;

import java.util.Scanner;

/**
 *
 * @author joao_batista
 */
public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sc_car = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);
        String an, pn, fn, pd, fc, ae, pe, fe;
        int ai, pi, fi, am;
        System.out.println("Aluno\nDigite o Nome");
        an = sc_car.nextLine();
        System.out.println("Digite a idade");
        ai = sc_num.nextInt();
        System.out.println("Digite o endereço");
        ae = sc_car.nextLine();
        System.out.println("Digite a matricula");
        am = sc_num.nextInt();

        System.out.println("Professor\nDigite o Nome");
        pn = sc_car.nextLine();
        System.out.println("Digite a idade");
        pi = sc_num.nextInt();
        System.out.println("Digite o endereço");
        pe = sc_car.nextLine();
        System.out.println("Digite a disciplina");
        pd = sc_car.nextLine();

        System.out.println("Funcionário\nDigite o Nome");
        fn = sc_car.nextLine();
        System.out.println("Digite a idade");
        fi = sc_num.nextInt();
        System.out.println("Digite o endereço");
        fe = sc_car.nextLine();
        System.out.println("Digite a cargo");
        fc = sc_car.nextLine();
        
        Aluno a = new Aluno(an,ae,ai,am);
        Professor p = new Professor(pn,pe,pi,pd);
        Funcionario f = new Funcionario(fn,fe,fi,fc);
        
        a.status();
        p.status();
        f.status();
    }
}
