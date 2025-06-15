
package Lista_de_Exercicio_5_Herança.Exercicio_15_Midias;

public class Main_Midias {
    public static void main(String[] args) {
        Musica minha_musica = new Musica("Bohermian Rhapsody", 660, "Queen", "Bohermian Rhapsody");
        Filme meu_filme = new Filme ("Meu Mavaldo Favorito", 148, "Diretor do filme", "Animação");
        Jogo meu_jogo = new Jogo ("Castlevania SOTN", 660, "Multiplataforma", 14);
        
        System.out.println("Música\nTítulo: "+minha_musica.getTitulo()+"\nArtista: "+minha_musica.getArtista());
        System.out.println("Filme\nTítulo: "+meu_filme.getTitulo()+"\nDiretor: "+meu_filme.getDiretor());
        System.out.println("Jogo\nTítulo: "+meu_jogo.getTitulo()+"\nPlataforma: "+meu_jogo.getPlataforma()
                +"Classificação: "+meu_jogo.getClassificacao());
        
    }
}
