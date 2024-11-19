package LP2.Lista4_ex001;

public class Peixe extends Animal {
    private String barbatana;
    private String cauda;

    public Peixe(String ambiente, double comprimento, String cor, String nome, int numeroDePatas, double velocidadeMedia, String barbatana, String cauda) {
        super(ambiente, comprimento, cor, nome, numeroDePatas, velocidadeMedia);
        this.barbatana = barbatana;
        this.cauda = cauda;
    }

    public String getBarbatana() {
        return barbatana;
    }

    public void setBarbatana(String barbatana) {
        this.barbatana = barbatana;
    }

    public String getCauda() {
        return cauda;
    }

    public void setCauda(String cauda) {
        this.cauda = cauda;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(", barbatana = " + barbatana + '\'' +
                ", cauda = " + cauda + " }");
    }


}
