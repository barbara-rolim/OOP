package Ex08;
/** Crie uma classe chamada Produto com os seguinte atributos: nome, preço e quantidade em stock.
 O construtor deve receber o nome e o preço. A quantidade em stock deve começar, por predefinição, a 0.
 Crie métodos de acesso get para todos os atributos. Crie método de acesso set para o preço.
 Crie um método para adquirirStock, que recebe um inteiro como parâmetro e incrementa ao stock existente,
 deve apresentar mensagem de confirmação.
 Crie um método para venderProduto, que recebe um inteiro como parâmetro que é a quantidade a ser vendida,
 analise se temos stock suficiente para satisfazer o pedido. Se tivermos stock, efetuamos a venda, apresentamos
 uma mensagem de sucesso incluindo o total da compra, e decrementamos ao stock. Se não tivermos stock,
 apresentamos mensagem de indisponibilidade de stock, e não alteramos o stock, uma vez que a venda não é
 efetuada.
 No Main:
 a) Instancie três produtos, definindo os seus atributos usando o construtor.
 b) Adquira stock para cada um deles.
 c) Tente fazer uma compra válida.
 d) Tente fazer uma compra inválida.
 e) Troque o preço de um produto.
 f) Tente fazer uma compra válida.
 g) Imprima o stock dos três produtos (verifique se estão como esperado)**/
public class Produto {
    private String nome;
    private double preço;
    private int stock = 0;

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return stock;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void adquirirStock(int produto){
        stock += produto;
        System.out.println("Strock Adquirido");
    }

    public void venderProduto(int venda){
        if(stock >= venda) {
            stock -= venda;

            double totalVenda = stock * preço;

            System.out.println("Produto Vendido");
        }else{
            System.out.println("Não hã stock");
        }
    }

    public void exibirDetalhes() {
        System.out.println(nome + " | " + preço + " € | Stock: " + stock);
    }
}
