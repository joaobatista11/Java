
package Exercicio_10_HashSet_Facil;

import java.util.HashSet;
import java.util.Scanner;

public class Exercicio_10_Lista_com_Intere {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String p;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Escreva um nome de animal");
            p = tecla.nextLine().toLowerCase();
            set.add(p);

        }
        
        for (String animais : set) {
            System.out.println(animais);
        }
            
    }
}
