package NivelIntermediario5;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    Rank rankDoNinja;


    public Ninja(){
    }

    //TODO NINJA VAI FAZER OBRIGATORIAMENTE!
    final void tacarkunai(){
        System.out.println("EU SOU UM METODO DA CLASSE MAE E TU TAQUEI UMA KUNAI!");
    }

    public Ninja(String aldeia, int idade, String nome, int numeroDeMissoesConcluidas, Rank rankDoNinja) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rankDoNinja = rankDoNinja;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome e "+nome+".E essa e minha habilidade especial!");
    }
}
