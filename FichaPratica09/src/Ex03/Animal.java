package Ex03;
import java.util.ArrayList;

public class Animal {
    private String nome;
    private String especie;
    private String país;
    private int peso;
    private ArrayList<String> dieta = new ArrayList<>();
    private ReinoAnimal reino;

    public Animal(String nome, String especie, String país, int peso, ArrayList<String> dieta, ReinoAnimal reino) {
        this.nome = nome;
        this.especie = especie;
        this.país = país;
        this.peso = peso;
        this.dieta = dieta;
        this.reino = reino;
    }

    public void fazerBarulho() {
        switch (this.reino) {
            case AVE -> System.out.println("Kwak Kwak");
            case MAMÍFERO -> System.out.println("Tinoninoni");
            case ANFÍBIO -> System.out.println("Brrrrrrrrr");
            case PEIXE -> System.out.println("Blub blub");
        }
    }

    public void comer(String alimento, double pesoAlimento) {
        if (dieta.contains(alimento)) {
            this.peso += pesoAlimento / 1000.0;

            System.out.println("O " + especie + " " + nome + " comeu " + alimento);
            fazerBarulho();
        } else {
            System.out.println("O " + especie + " " + nome + " nao come " + alimento);
        }
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | " + this.país +
                " | Peso: " + this.peso + " Kg | " + this.reino);

        System.out.print("Dieta: ");

        for (int i = 0; i < this.dieta.size(); i++) {
            System.out.print(this.dieta.get(i) + " - ");
        }

        System.out.println("\n");
    }
}
