package NivelIntermediarioENUM;

public enum RankMissao {
    A(4,"supremo"),
    B(3,"alto"),
    C(2,"medio"),
    D(1,"baixo");

    private String descricao;
    private int dificuldade;

    RankMissao(int dificuldade, String descricao) {
        this.dificuldade = dificuldade;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
