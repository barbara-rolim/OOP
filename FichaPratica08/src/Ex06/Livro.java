package Ex06;
/**6. Crie uma classe chamada Livro com o seguintes atributos: título, autor, categoria, número de páginas e ISBN. Crie um método chamado exibirDetalhes( ) que imprime na consola todos os atributos do livro. Na classe Main: a) Instância dois Livros, definindo os seus atributos usando o construtor. b) Invoque o método de exibirDetalhes para ambos os livros. A partir deste exercício, crie o método exibirDetalhes( ) para todas as classes.**/

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numPag;
    private String ISBN;

    public Livro(String titulo, String autor, String categoria, int numPag, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPag = numPag;
        this.ISBN = ISBN;
    }

    public void exibirDetalhes(){
        System.out.println(titulo + " " + autor + " " + categoria + " " + numPag + " " + ISBN);
    }
}
