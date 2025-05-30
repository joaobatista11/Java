
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_4_e_17_Livraria_Especial;

public class Livro_Especial {
String titulo, autor;
int ano_publicacao;
boolean disponivel;
    // Construtor 1
    public Livro_Especial(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    // Construtor 2
    public Livro_Especial(String titulo, String autor, int ano_publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.setDisponivel(true);
    }

    public void status(){
    
        System.out.println("## Informações do livro cadastrado ##\n\nTítulo: "+this.titulo+"\nAutor: "+this.autor
        +"\nAno de Publicação: "+this.ano_publicacao);
    
    }
    
void emprestar(){
if(disponivel){
disponivel = false;
System.out.println("Livro "+titulo+" emprestado com sucesso");
}else{
System.out.println("Livro "+titulo+" não disponivel para emprestimo");
}
}

void devolver(){
if(!disponivel){
disponivel=true;
System.out.println("Livro "+titulo+" devolvido com sucesso.");
}else{
System.out.println("Livro "+titulo+" não foi emprestado.");
}
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
