package LP2.Lista4_ex001;

public abstract class Animal {
    private String nome;
    private double comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;

    public Animal() {
    }

    public Animal(String ambiente, double comprimento, String cor, String nome, int numeroDePatas, double velocidadeMedia) {
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.cor = cor;
        this.nome = nome;
        this.numeroDePatas = numeroDePatas;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void exibirDados() {
        System.out.println("{" +
                "ambiente = " + ambiente + '\'' +
                ", nome = " + nome + '\'' +
                ", comprimento = " + comprimento +
                ", numeroDePatas = " + numeroDePatas +
                ", cor = " + cor + '\'' +
                ", velocidadeMedia = " + velocidadeMedia
                );
    }
}
