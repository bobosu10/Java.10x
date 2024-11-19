package LP2.Lista4_ex001;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String ambiente, double comprimento, String cor, String nome, int numeroDePatas, double velocidadeMedia, String alimento) {
        super(ambiente, comprimento, cor, nome, numeroDePatas, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(", alimento = " + alimento + " }");
    }
}
