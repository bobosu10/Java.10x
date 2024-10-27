package LP2.Lista3_ex004;

public class Pais {
    private String sigla,nome;
    private int populacao,dimensao;

    public Pais() {
    }

    public Pais(int dimensao, String nome, int populacao, String sigla) {
        this.dimensao = dimensao;
        this.nome = nome;
        this.populacao = populacao;
        this.sigla = sigla;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double densidadeDoPais(){
        return (double) populacao/dimensao;
    }

    @Override
    public String toString(){
        return String.format(
                "\"\uD83C\uDF0E Pais cadstrado \"\uD83C\uDF0E \n NOME : "+nome+"\n SIGLA : "+sigla+"\n POPULACAO : "+populacao+"\n DIMENSAO : "+dimensao+"\n DENSIDADE : "+densidadeDoPais()
        );



    }

}
