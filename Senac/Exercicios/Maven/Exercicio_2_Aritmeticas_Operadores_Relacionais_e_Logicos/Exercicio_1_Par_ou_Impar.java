package exercicios_2_Aritmeticas_Operadores_Relacionais_e_Logicos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.olamundo.Aulas.Basico.*;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Exercicio_1_Par_ou_Impar {
    public static void main(String[] args) {
        
        Scanner tecla = new Scanner (System.in);
        System.out.println("Digite um numero");
    int n = tecla.nextInt();
    
    boolean ispar = (n % 2 == 0);

     if(ispar == true){
    System.out.println("O numero "+n+" e par");
        }else{
    System.out.println("O numero "+n+" e impar");
        }
    //tecla.close();
    }
    
}
