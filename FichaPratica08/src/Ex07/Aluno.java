package Ex07;
/**Crie uma classe chamada Aluno com os seguintes atributos: nome, idade, email, curso e média.
 O construtor deve receber os cinco atributos. Crie métodos de acesso get para todos os atributos. Crie métodos
 de acesso set para o curso e para a média. Crie um método felizAniversario( ) que aumenta 1 à idade do Aluno.
 Crie um método boolean situacaoAprovacao( ) que com base na média retorna true se o aluno tiver aprovação
 ou false se o aluno estiver reprovado (se a média for maior que 9.5, considera-se aprovado).
 No Main:
 a) Instância dois Alunos, definindo os seus atributos usando o construtor, um deles com média de 15
 e outro com média de 7.5.
 b) Invoque o método situacaoAprovacao( ) de forma a imprimir se um aluno está ou não aprovado**/
public class Aluno {
    private String nome;
    private int idade;
    private String email;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String email, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void felizAniversario() {
        this.idade++;
    }

    public boolean situacaoAprovacao() {
        if (media > 9.5){
           return true;
        }else
        {
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n_____ ALUNO _____");
        System.out.println(nome + " | " + email + " | Idade: " + idade);
        System.out.println(curso + " | Média: " + media);
    }

    public String getNome() {
        return nome;
    }
}
