
package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_14_Filtrar_Palavras {
    public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> pala = new ArrayList<>();
    Scanner tecla = new Scanner(System.in);
        String n;
        
        for (int c = 1; c <= 5; c++) {
            System.out.println(c+". Escreva uma palavra");
            lista.add(tecla.nextLine());
        }
for (String tam : lista) {
    if(tam.length()>5){
    pala.add(tam);  
}
}
        for (String carac : pala) {
            System.out.println(carac);
        }      

}
}