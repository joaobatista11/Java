package Lista_de_Exercicio_3_Encapsulamento.Exercicio_15_Calculadora;

import java.util.Scanner;

public class Calculadora_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, r = 0;
        int o;
        System.out.println("Digite o primeiro numero:");
        a = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        b = sc.nextDouble();
        Soma s = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao m = new Multiplicacao();
        Divisao d = new Divisao();
        System.out.println("Escolha uma operação:\n1 - Soma(+)\n2 - Subtracão(-)\n3 - Multiplicação(x)\n4 - Divisão(/)");
        o = sc.nextInt();
            switch (o) {
                case 1 -> {
                    r = s.calcular(a, b);
                }
                case 2 -> {
                    r = sub.calcular(a, b);
                }
                case 3 -> {
                    r = m.calcular(a, b);
                }
                case 4 -> {
                    r = d.calcular(a, b);
                }
                default -> {
                    System.out.println("ERRO!\nOpção inválida!\nDigite o número que corresponde na escolha de operação!"); // o while e do while não funionaram :(
                }
            }
            if(o>=1 && o<=4){
                System.out.println(r);
            }
    }
}
