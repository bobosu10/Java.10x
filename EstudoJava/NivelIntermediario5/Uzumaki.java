package NivelIntermediario5;

public class Uzumaki extends Ninja {

    Rank rankDoNinja;
    Bijus bestaDeCauda;

    public Uzumaki() {
    }

    public Uzumaki(String aldeia, int idade, String nome, int numeroDeMissoesConcluidas, Rank rankDoNinja) {
        super(aldeia, idade, nome, numeroDeMissoesConcluidas, rankDoNinja);
    }

    public Uzumaki(String aldeia, int idade, String nome, int numeroDeMissoesConcluidas, Rank rankDoNinja, Bijus bestaDeCauda) {
        super(aldeia, idade, nome, numeroDeMissoesConcluidas, rankDoNinja);
        this.bestaDeCauda = bestaDeCauda;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome e "+nome+".E esse e meu ataque uzumaki!");
    }
}
