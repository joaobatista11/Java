
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_4_e_17_Livraria_Especial;

import java.util.Scanner;

public class Main_Livro_Especial {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Livro_Especial livro = new Livro_Especial("O Rei do Nada","Jacque Stobar",2005);

        livro.disponivel=true;
        livro.status();
        System.out.println("\nDeseja emprestar o livro? [S/N]");
       String opcao = sc.nextLine().toLowerCase();
    if(opcao.equalsIgnoreCase("s")){
    livro.emprestar();
    }
        System.out.println("\n Deseja devolver o livro? [S/N]");
       opcao = sc.nextLine().toLowerCase();
    if(opcao.equalsIgnoreCase("s")){
    livro.devolver();
    }
    sc.close();
}
}