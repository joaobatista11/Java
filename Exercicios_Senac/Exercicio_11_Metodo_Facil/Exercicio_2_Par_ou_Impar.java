
package Exercicio_11_Metodo_Facil;

import java.util.Scanner;

public class Exercicio_2_Par_ou_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero");
        n = sc.nextInt();
        ispar(n);
    }

    public static boolean ispar(int n) {

        if(n%2==0){
            System.out.println("Par");
            return true;
        }else{
            System.out.println("Impar");
            return false;
        }
        
    }
}
