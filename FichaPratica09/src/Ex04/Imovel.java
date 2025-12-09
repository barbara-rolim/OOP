package Ex04;

public class Imovel {
    private String rua;
    private String numPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double areaTotal;
    private int numQuartos;
    private int numCasaDeBanho;
    private double areaPiscina;

    public Imovel(String rua, String numPorta, String cidade, Tipo tipo, Acabamento acabamento, double areaTotal, int numQuartos, int numCasaDeBanho, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.areaTotal = areaTotal;
        this.numQuartos = numQuartos;
        this.numCasaDeBanho = numCasaDeBanho;
        this.areaPiscina = areaPiscina;
    }

    public double calcularValor() {
        double valor = 0;

        switch (tipo) {
            case CASA -> valor = 3000;
            case MANSAO -> valor = 5000;
            case APARTAMENTO -> valor = 1000;
        }

        double valorImovel = areaTotal * valor;

        switch (acabamento) {
            case PARA_RESTAURO -> valorImovel *= 0.50;
            case USADA -> valorImovel *= 0.9;
            case NOVA -> valorImovel *= 1;
            case NOVA_COM_ALTO_ACABAMENTO -> valorImovel *= 1.25;
        }

        valorImovel += numQuartos * 7500;

        valorImovel += numCasaDeBanho * 10500;

        valorImovel += areaPiscina * 1000;

        return valorImovel;
    }
}