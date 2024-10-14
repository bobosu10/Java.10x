package NivelIntermediarioENUM;

public class Missoes {
    private String nome;
    private RankMissao rank;

    public void exiborDetalhes(){
        System.out.println("missao : "+nome+" | rank da missao : "+rank+" (descricao) : "+rank.getDescricao()+" (dificuldade) : "+rank.getDificuldade());
    }
    public Missoes(RankMissao rank, String nome) {
        this.rank = rank;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankMissao getRank() {
        return rank;
    }

    public void setRank(RankMissao rank) {
        this.rank = rank;
    }
}
