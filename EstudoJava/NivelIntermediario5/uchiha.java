package NivelIntermediario5;

public class uchiha extends Ninja implements ShariganInterface {

    public uchiha() {
    }

    public uchiha(String aldeia, int idade, String nome, int numeroDeMissoesConcluidas, Rank rankDoNinja) {
        super(aldeia, idade, nome, numeroDeMissoesConcluidas, rankDoNinja);
    }

    @Override
    public void SharinganAtivado() {
        System.out.println("O sharingan ativou...");
    }
}
