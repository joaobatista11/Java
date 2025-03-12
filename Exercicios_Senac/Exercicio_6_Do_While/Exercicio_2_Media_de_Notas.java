
package Exercicio_6_Do_While;

import java.util.Scanner;

public class Exercicio_2_Media_de_Notas {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int c = 0, n, s=0, m=0;
        do{
               c++;
        System.out.println("Digite a "+c+"º nota do(a)  Aluno(a) de 0 a 10");
        n = tecla.nextInt();
        while(n<0 || n>10){
        System.out.println("Nota invalida");
        System.out.println("Digite a "+c+"º nota do(a)  Aluno(a) de 0 a 10");
        n = tecla.nextInt();        
        }
     
        s+=n;
    }while(c<4);
        m=s/c;
        System.out.println("A soma:"+s+"\nA media: "+m);
    }
}
