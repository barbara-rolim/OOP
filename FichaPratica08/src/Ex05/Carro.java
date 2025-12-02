package Ex05;

/**. Crie uma classe chamada Carro com os seguintes atributos: marca, modelo, cor e ano de fabrico.
 Crie um método na classe Carro chamado ligar que imprime a mensagem "O {marca} {modelo} {cor} está
 ligado…". Por exemplo: “O Mercedes A250e branco está ligado…”.
 Na classe Main:
 a) Instâncie dois Carros, definindo os seus atributos usando o construtor.
 b) Invoque o método ligar para ambos os carros**/
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("O " + marca + " " + modelo + " " + cor  + " está ligado");
    }
}
