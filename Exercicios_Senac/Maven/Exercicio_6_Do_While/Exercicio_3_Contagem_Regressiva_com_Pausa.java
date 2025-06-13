
package Exercicio_6_Do_While;

public class Exercicio_3_Contagem_Regressiva_com_Pausa {
    public static void main(String[] args) throws InterruptedException {
        int c=10;
        do{
            Thread.sleep(1000);
            System.out.println(c);
            c--;
        }while(c>=1);
    }
}
