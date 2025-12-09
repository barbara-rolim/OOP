package Ex03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String[] dietaTrombas = new String[3];
//        dietaTrombas[0]="Erva";
//        dietaTrombas[1]="Palha";
//        dietaTrombas[2]="Fruta";
//
//        Animal trombas = new Animal("Trombas","Elefante","África do Sul",3500,dietaTrombas,ClasseAnimal.MAMIFERO);

        Animal trombas = new Animal(
                "Trombas",
                "Elefante",
                "África do Sul",
                3500,
                new ArrayList<>(Arrays.asList("Erva", "Palha", "Fruta")),
                ReinoAnimal.MAMÍFERO
        );

        Animal jubas = new Animal(
                "Jubas",
                "Leão",
                "África do Sul",
                350,
                new ArrayList<>(Arrays.asList("Bife", "Chouriço")),
                ReinoAnimal.AVE
        );


        trombas.exibirDetalhes();
        jubas.exibirDetalhes();

        System.out.println("____________________________________________");

        trombas.comer("Bife", 500);
        jubas.comer("Bife", 1500);

        System.out.println("____________________________________________");

        trombas.exibirDetalhes();
        jubas.exibirDetalhes();

        System.out.println("____________________________________________");
    }
}