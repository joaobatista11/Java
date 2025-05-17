package com.mycompany.projeto;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = tecla.nextLine().toLowerCase();
        if (!(nome.contains(" "))) {
            System.out.println("Digite o seu email");
            String email = tecla.nextLine();
            if (email.contains("@") && email.endsWith(".com")) {
                System.out.println("Digite a senha");
                String senha = tecla.nextLine();
                if (senha.length() >= 5) {
                    System.out.println("Digite a senha novamente");
                    String confsenha = tecla.nextLine();
                    if (confsenha.equals(senha)) {
                        System.out.println("Login concluido\nSeja Bem vindo " + nome);
                    } else {
                        System.out.println("Senha invalida");
                    }
                } else {
                    System.out.println("A senha tem que possuir mais de 5 caracteres");
                }
            }
        } else {
            System.out.println("nome invalido");
        }
    }
}
