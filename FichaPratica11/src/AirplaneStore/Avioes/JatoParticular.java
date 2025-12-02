package AirplaneStore.Avioes;

import AirplaneStore.Enums.CategoriaJato;
import AirplaneStore.Enums.Instalacao;
import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeDaBagagem;
    private CategoriaJato categoria;
    private ArrayList<Instalacao> comodidades;

    public JatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco, int lotacao, double capacidadeDaBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, alturaCauda, numMotores, autonomia, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeDaBagagem = capacidadeDaBagagem;
        this.categoria = categoria;
    }

    public void montarInstalacao(Instalacao instalacaoNova){
        this.comodidades.add(instalacaoNova);
        System.out.println("Intalação " + instalacaoNova + "Modelo de instalação");
    }

    public void removerInstalacao(Instalacao instalacaoRemovida){
        System.out.println("Intalação " + instalacaoRemovida + "Modelo de instalação Removido");
        this.comodidades.remove(instalacaoRemovida);
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade Bagagem " + this.categoria);
    }
}
