
package Lista_de_Exercicio_1.Exercicio_7_Livraria;

public class Livro {
String titulo, autor;
int ano_publicacao;
boolean disponivel;

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


}
