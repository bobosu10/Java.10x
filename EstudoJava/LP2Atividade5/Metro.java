package LP2Atividade5;

public class Metro extends Transporte{

    private int numeroDeEstacoesPercorridas;


    public Metro(int numeroDeEstacoesPercorridas) {
        this.numeroDeEstacoesPercorridas = numeroDeEstacoesPercorridas;
    }

    public Metro(String descricao, int numeroDeEstacoesPercorridas) {
        super(descricao);
        this.numeroDeEstacoesPercorridas = numeroDeEstacoesPercorridas;
    }

    public int getNumeroDeEstacoesPercorridas() {
        return numeroDeEstacoesPercorridas;
    }

    public void setNumeroDeEstacoesPercorridas(int numeroDeEstacoesPercorridas) {
        this.numeroDeEstacoesPercorridas = numeroDeEstacoesPercorridas;
    }

    @Override
    public String exibirDetalhes() {
        setTarifa(4.3);
        return super.exibirDetalhes()+"\n Numero de estacoes percorridas: "+numeroDeEstacoesPercorridas+"\n";
    }
}
