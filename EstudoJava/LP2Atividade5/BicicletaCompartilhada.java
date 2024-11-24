package LP2Atividade5;

public class BicicletaCompartilhada extends Transporte{

    private double usoPorHora;

    public BicicletaCompartilhada(int usoPorHora) {
        this.usoPorHora = usoPorHora;
    }

    public BicicletaCompartilhada(String descricao, double usoPorHora) {
        super(descricao);
        this.usoPorHora = usoPorHora;
    }

    public double getUsoPorHora() {
        return usoPorHora;
    }

    public void setUsoPorHora(double usoPorHora) {
        this.usoPorHora = usoPorHora;
    }

    @Override
    public double calcularTarifa() {
        return usoPorHora*1.5;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()+"\n Horas de uso: "+usoPorHora+"\n";
    }
}
