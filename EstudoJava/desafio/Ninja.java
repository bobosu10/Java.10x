package desafio;

public class Ninja {
    String nome;
    int idade;
    String missao;
    char nivelDificuldade;
    String statusMissao;

    public void MostrarInfo(){
        System.out.println("Sou o ninja "+nome);
        System.out.println("minha missao e "+missao);
        System.out.println("Dificuldade da missao : "+nivelDificuldade);
        System.out.println("Status da missao : "+statusMissao);
    }
}
