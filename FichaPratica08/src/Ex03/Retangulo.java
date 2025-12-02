package Ex03;

public class Retangulo {
    String cor = "Branco";
    double altura;
    double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro(){
        return this.largura + this.largura + this.altura + this.altura;
    }
}
