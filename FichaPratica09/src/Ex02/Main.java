package Ex02;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(100, 60, 0);

        c1.pedirEmprestimo(100);
        c1.amortizarEmprestimo(50);
    }
}
