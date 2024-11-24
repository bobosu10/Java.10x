package LP2Atividade5;

public class Onibus extends Transporte{

    private boolean intermunicipal;

    public Onibus(boolean intermunicipal) {
        this.intermunicipal = intermunicipal;
    }

    public Onibus(String descricao, boolean intermunicipal) {
        super(descricao);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    public void setIntermunicipal(boolean intermunicipal) {
        this.intermunicipal = intermunicipal;
    }

    @Override
    public double calcularTarifa() {
        if (intermunicipal) {
            return super.calcularTarifa()*1.5;
        }else {
            return super.calcularTarifa();
        }
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()+"\n Intermunicipal: "+intermunicipal+"\n";
    }
}
