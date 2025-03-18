
package Exercicio_8_Arraylist;

import java.util.ArrayList;

public class Exercicio_2_Remover_Pares_de_1_a_10 {
    public static void main(String[] args) {
                ArrayList<Integer> lista = new ArrayList<>();
                
                for (int c = 1; c <= 10; c++){
                boolean ispar = (!(c % 2 == 0));
                    if(ispar == true){
                    lista.add(c);
                    }
        }
                    for (Integer contador : lista) {
                System.out.println(contador);
            }
                    
    }
}
