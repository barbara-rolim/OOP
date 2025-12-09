package Ex04;

public class Main {
    public static void main(String[] args) {

    Imovel i = new Imovel("Rua X", "12", "Lisboa",
            Tipo.CASA,
            Acabamento.NOVA_COM_ALTO_ACABAMENTO,
            150, 3, 2, 20);

        System.out.println(i.calcularValor());
    }
}