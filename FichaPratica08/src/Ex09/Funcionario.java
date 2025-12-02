package Ex09;
/**Crie uma classe chamada Funcionário com os seguintes atributos: nome, email, departamento e salário.
 O construtor deve receber todos os atributos. Crie métodos de acesso get para todos os atributos. Crie método
 de acesso set para o departamento.
 Crie o método aumentarSalario que recebe um valor real por parâmetro que representa a percentagem do
 aumento a ser aplicado (por exemplo: recebe 15, representa um aumento de 15%).
 No main:
 a) Instâncie um funcionário, definindo os seus atributos usando o construtor.
 b) Exiba todos os dados do funcionário.
 c) Aumente o salário.
 d) Exiba novamente os dados do funcionário**/
public class Funcionario {
    private String nome;
    private String email;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String email, String departamento, double salario) {
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void aumentarSalario(double aumentoPercentagem) {
        salario *= 1 + aumentoPercentagem / 100;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.email);
        System.out.println(this.departamento + " | Salário: " + this.salario + " €");
    }
}
