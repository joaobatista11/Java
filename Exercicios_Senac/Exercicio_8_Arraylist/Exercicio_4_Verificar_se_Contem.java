package Exercicio_8_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_4_Verificar_se_Contem {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        String p,m;
        boolean contem;
        
        for (int c = 1; c <= 3; c++) {
            System.out.println(c + ". Escreva uma cor");
            p = tecla.nextLine().toLowerCase();
            lista.add(p);
            
        }
        for (String cores : lista) {
                System.out.println(cores.equalsIgnoreCase(cores)+"\n");
        }contem = lista.contains("Amarelo");
        if (contem==true){
             System.out.println("Contem amarelo");
         }else{
             System.out.println("Nao contem amarelo");
         }
    
}
}