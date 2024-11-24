package LP2Atividade5;

public abstract class Transporte {

    private String descricao;
    private double tarifa = 5.0;

    public Transporte() {
    }

    public Transporte(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double calcularTarifa(){;
        return tarifa;
    }

    public String exibirDetalhes(){
        return "============informacoes============\n Descricao: "+getDescricao()+"\n Tarifa: "+calcularTarifa();
    }
}
