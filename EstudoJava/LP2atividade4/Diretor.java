package LP2atividade4;

public class Diretor {
    private String nome, localDeOrigem;
    private int tempoDeExperiencia;

    public Diretor() {
    }

    public Diretor(String localDeOrigem, String nome, int tempoDeExperiencia) {
        this.localDeOrigem = localDeOrigem;
        this.nome = nome;
        this.tempoDeExperiencia = tempoDeExperiencia;
    }

    public String getLocalDeOrigem() {
        return localDeOrigem;
    }

    public void setLocalDeOrigem(String localDeOrigem) {
        this.localDeOrigem = localDeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoDeExperiencia() {
        return tempoDeExperiencia;
    }

    public void setTempoDeExperiencia(int tempoDeExperiencia) {
        this.tempoDeExperiencia = tempoDeExperiencia;
    }

    @Override
    public String toString() {
        return "{" +
                "localDeOrigem ='" + localDeOrigem + '\'' +
                ", nome ='" + nome + '\'' +
                ", tempo de experiencia em anos =" + tempoDeExperiencia +
                '}';
    }
}



