package Exercicio_10_HashSet_Facil;


import java.util.HashSet;
import java.util.Scanner;


public class Exercicio_1_Lista_de_numeros {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+". Digite um numero");    
            n = tecla.nextInt();
                        set.add(n);
            if(n>10 || n<1){
            i--;
            set.remove(n);
                System.out.println("Numero invalido");          
           
        }
            
    }
        for(int num: set){
            System.out.println(num);
        }
        if(set.contains(5)){
                System.out.println("Contem o numero 5");     
            }else{
                System.out.println("Nao contem o numero 5");
            }
}
}