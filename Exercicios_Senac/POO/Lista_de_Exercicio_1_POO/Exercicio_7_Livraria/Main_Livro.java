
package Lista_de_Exercicio_1.Exercicio_7_Livraria;

import java.util.Scanner;

public class Main_Livro {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Livro livro = new Livro();
        System.out.println("Digite o título do livro:");
        livro.titulo=sc.nextLine();
        System.out.println("Digite o autor do livro");
        livro.autor=sc.nextLine();
        System.out.println("Digite o ano de publicação:");
        livro.ano_publicacao=sc.nextInt();
        livro.disponivel=true;
        
        System.out.println("## Informações do livro cadastrado ##\n\nTítulo: "+livro.titulo+"\nAutor: "+livro.autor+
                "\nAno de Publicação: "+livro.ano_publicacao+"\n\neseja emprestar o livro? [S/N]");
        sc.nextLine();
       String opcao = sc.nextLine();
    if(opcao.equalsIgnoreCase("s")){
    livro.emprestar();
    }
        System.out.println("\n Deseja devolver o livro? [S/N]");
        sc.nextLine();
       opcao = sc.nextLine();
    if(opcao.equalsIgnoreCase("s")){
    livro.devolver();
    }
    sc.close();
}
}