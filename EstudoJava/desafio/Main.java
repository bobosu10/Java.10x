package desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Uchiha madara = new Uchiha();
        madara.nome = "Madara Uchiha";
        madara.idade = 200;
        madara.missao = "concluir o tsukuyomi infinito";
        madara.nivelDificuldade = 'S';
        madara.statusMissao = "Nao concluida!";
        madara.habilidadeEspecial = "Rinnegan";
        madara.MostrarInfo();

        System.out.println("-----------------------------------------");

        Ninja hashirama = new Ninja();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 40;
        hashirama.missao = "Trazer a paz a konoha";
        hashirama.nivelDificuldade = 'S';
        hashirama.statusMissao = "Nao concluida!";
        hashirama.MostrarInfo();

    }
}
