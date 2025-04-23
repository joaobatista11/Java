package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Criador_de_Lista {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner teclanum = new Scanner(System.in);
        Scanner teclacar = new Scanner(System.in);
        int n, r, q = lista.size();
        String p,s;
        do {
               //lista.clear();
            System.out.println("Menu de lista\n\n1. Adicionar um nome\n2. Remover um nome\n3.Verificar lista\n4.Verifcar quantidade\n5. Selecionar um nome\n6. Sair\n\nDigite um numero para selecionar");
            n = teclanum.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Digite o nome que quer adicionar");
                    p = teclacar.nextLine();
                    lista.add(p);
                    break;
                case 2:
                    System.out.println("Digite o nome que quer remover");
                    p = teclacar.nextLine();
                    lista.remove(p);
                    break;
                case 3:
                    System.out.println("Lista\n");
                    for (String nome : lista) {
                        System.out.println(nome);
                    }
                    break;
                case 4:
        System.out.println("Tem "+q+" nomes");
                    break;
                case 5:
                    System.out.println("Digite um de 0 a "+q+" nomes para selecionar");
                        n = teclanum.nextInt();
                    s = lista.get(n);
                    System.out.println(s+ " Selecionado");
                    break;
                case 6:
                    System.out.println("Voce saiu");
                    break;
                default:
                    System.out.println("Numero invalido");
                    break;
                    
                            
            }
          
        } while (n != 6);
    }
}
