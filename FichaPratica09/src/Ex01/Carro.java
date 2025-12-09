package Ex01;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;
    private int potencia;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoLitro;

    public Carro(String marca, String modelo, String cor, int anoFabrico, int potencia, int cc, TipoCombustivel combustivel, double consumoLitro) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoLitro = consumoLitro;
    }

    public int getPotencia() {
        return potencia;
    }

    public void ligar() {
        System.out.println("O " + this.marca + " " + this.modelo + " " + this.cor + " está ligado.");
    }

    public Carro corrida(Carro adversario) {
        if (this.potencia > adversario.potencia) {
            // Ganha o meu carro
            return this;
        } else if (this.potencia < adversario.potencia) {
            // Ganha o adversario
            return adversario;
        } else {
            // Empate - PotenciaCv

            if (this.cc > adversario.cc) {
                // Ganha o meu carro
                return this;
            } else if (this.cc < adversario.cc) {
                // Ganha o adversario
                return adversario;
            } else {

                // Empate - cc

                if (this.anoFabrico > adversario.anoFabrico) {
                    // Ganha o meu carro
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) {
                    // Ganha o adversario
                    return adversario;
                } else {
                    // Empate
                    return null;
                }
            }
        }
    }

    public double calcularConsumo(double distanciaKm) {
        return distanciaKm / consumoLitro;
    }

    public void exibirDetalhes() {
        System.out.println(this.marca + " | " + this.modelo + " | " + this.cor + " | " + this.anoFabrico);
    }
}