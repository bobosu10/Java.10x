package LP2.Lista2_ex002;

public class Jogador {
    private String nome;
    private String posicao;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(double altura, String nacionalidade, String nome, double peso, String posicao) {
        this.altura = altura;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.peso = peso;
        this.posicao = posicao;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double IMC(){
        return ((peso)/(altura*altura));
    }
    public void ExebirDados(){
        System.out.println("dados do jogador "+nome);
        System.out.println("======================================================");
        System.out.println("Posicao : "+posicao);
        System.out.println("Nacionalidade : "+nacionalidade);
        System.out.println("Altura : "+altura);
        System.out.println("Peso : "+peso);
        System.out.println("IMC : "+IMC());
        System.out.println("======================================================");
    }
}
