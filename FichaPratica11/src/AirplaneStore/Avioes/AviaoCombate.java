package AirplaneStore.Avioes;

import AirplaneStore.Enums.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paísOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envAsas, double alturaCauda, int numMotores, double autonomia, double velMax, double preco, String paísOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, envAsas, alturaCauda, numMotores, autonomia, velMax, preco);
        this.paísOrigem = paísOrigem;
        this.camuflagem = camuflagem;
    }

    public void montarArma(Arma armaNova){
        if(this.arsenal.size() <3){
            System.out.println(armaNova+ "add ao" + modelo);
            this.arsenal.add(armaNova);
        }
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(this.paísOrigem);
    }
}
