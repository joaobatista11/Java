
package Prova;

import java.util.Scanner;

public class Questao_26 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String senha = null, confsenha = null, nome=null, email=null;
                do{
        System.out.println("Digite o seu nome");
        nome = sc.nextLine().toLowerCase();
        if (!(nome.contains(" "))) {
            do{
            System.out.println("Digite o seu email");
            email = sc.nextLine();
            if (email.contains("@") && email.endsWith(".com")) {
                
                do{
                System.out.println("Digite a senha");
                senha = sc.nextLine();
                if (senha.length() >= 5) {
                    
                    for (int i = 1; i <=3; i++) {
                    System.out.println(i+". Digite a senha novamente");
                    confsenha = sc.nextLine();
                    if (confsenha.equals(senha)) {
                        System.out.println("Login concluido\nSeja Bem vindo " + nome);
                        break;
                    } else {
                        System.out.println("Senha invalida");
                    }
                    if(!(confsenha.equals(senha)) && i==3){
                        System.out.println("Seu login foi bloqueado");
                        break;
                    }
                    }
                    
                } else {
                    System.out.println("A senha tem que possuir mais de 5 caracteres");
                }
                }while(!(senha.length() >= 5));
            
            }else{
                System.out.println("Login invalido");
            }
            }while(!(email.contains("@") && email.endsWith(".com")));

        } else {
            System.out.println("nome invalido");
        }
    }while(nome.contains(" "));
}
}