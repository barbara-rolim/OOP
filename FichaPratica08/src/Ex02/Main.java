package Ex02;

public class Main {
    public static void main(String[] args) {
        Edifício edifício1 = new Edifício("Manhattan", "25 De Setembro", "Poços de Caldas", "Amarelo", 2, true);

        System.out.println("\n Nome " + edifício1.getNome() + "\n Rua: " + edifício1.getRua() + "\n Cidade: " + edifício1.getCidade() + "\n Cor da Fachada: " + edifício1.getCorFachada() + "\n Número Andares: " + edifício1.getNumAndares() + "\n Garagem: " + edifício1.getGaragem());
}
}