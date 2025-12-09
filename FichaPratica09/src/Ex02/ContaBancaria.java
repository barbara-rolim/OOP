package Ex02;

public class ContaBancaria {
    private double saldo = 0;
    private double margemEmprestimo = 0.5;
    private double valorDivida = 0;

    public ContaBancaria(double saldo, double margemEmprestimo, double valorDivida) {
        this.saldo = saldo;
        this.margemEmprestimo = margemEmprestimo;
        this.valorDivida = valorDivida;
    }

    public void pedirEmprestimo(int valorEmprestimo){
        double limite = this.saldo * margemEmprestimo;

        if(valorDivida > 0){
            System.out.println("EMPRESTIMO RECUSADO");
            return;
        }

        if(valorEmprestimo > limite){
            System.out.println("EMPRESTIMO RECUSADO");
            return;
        }

        this.saldo += valorEmprestimo;
        this.valorDivida += valorEmprestimo;

        System.out.println("Emprestimo aprovado " + valorEmprestimo);
        System.out.println("Novo valor " + saldo);
        System.out.println("Valor divida " + valorDivida);
    }

    public void amortizarEmprestimo(double valor) {

        if (valor > valorDivida) {
            System.out.println(" Erro: não pode amortizar mais do que deve.");
            return;
        }

        if (valor > saldo) {
            System.out.println(" Erro: saldo insuficiente para amortizar.");
            return;
        }

        // Amortização válida
        this.saldo -= valor;
        this.valorDivida -= valor;

        System.out.println("Amortização realizada com sucesso!");
        System.out.println("Valor amortizado: " + valor + "€");
        System.out.println("Saldo atual: " + saldo + "€");
        System.out.println("Dívida restante: " + valorDivida + "€");
    }
}
