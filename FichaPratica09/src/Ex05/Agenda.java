package Ex05;

import java.util.ArrayList;

public class Agenda {
    private int anoCriacao = 2025;
    private ArrayList<Pessoa> listaContactos;

    public Agenda(int tamanhoLista) {
        this.listaContactos = new ArrayList<>(tamanhoLista);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        listaContactos.add(pessoa);
    }

    public void listarContactos() {
        for (Pessoa p : listaContactos) {
            p.exibirDetalhes();
        }
    }

    public void pesquisarContactosCidade(String cidadePesquisa) {
        System.out.println("\n_____ AGENDA: " + cidadePesquisa + " _____");

        for (int i = 0; i < this.listaContactos.size(); i++) {

            Pessoa pessoa = this.listaContactos.get(i);

            if (pessoa.getCidade().equals(cidadePesquisa)) {
                pessoa.exibirDetalhes();
            }
        }
    }
}