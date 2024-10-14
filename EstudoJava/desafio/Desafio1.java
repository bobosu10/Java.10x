package desafio;

public class Desafio1 {
    public static void main(String[] args) {
        String Nome1 = "Boruto";
        String Nome2 = "Naruto";
        String Nome3 = "Kakashi";
        short idade1 = 10;
        short idade2 = 34;
        short idade3 = 52;
        String Missao1 = "ir atras de um jinchuriki";
        String Missao2 = "encontrar com o kazekage";
        String Missao3 = "dar aula aos gennins";
        char NivelDaMissao1 = 'S';
        char NivelDaMissao2 = 'A';
        char NivelDaMissao3 = 'C';
        boolean ConcluiuMissao1 = false;
        boolean ConcluiuMissao2 = false;
        boolean ConcluiuMissao3 = false;
        System.out.println("---NINJA1---");
        System.out.println("NOME:" + Nome1);
        System.out.println("IDADE:" + idade1);
        System.out.println("MISSAO:" + Missao1);
        System.out.println("NIVEL DA MISSAO:" + NivelDaMissao1);
        System.out.println("---NINJA2---");
        System.out.println("NOME:" + Nome2);
        System.out.println("IDADE:" + idade2);
        System.out.println("MISSAO:" + Missao2);
        System.out.println("NIVEL DA MISSAO:" + NivelDaMissao2);
        System.out.println("---NINJA3---");
        System.out.println("NOME:" + Nome3);
        System.out.println("IDADE:" + idade3);
        System.out.println("MISSAO:" + Missao3);
        System.out.println("NIVEL DA MISSAO:" + NivelDaMissao3);
        if (idade1 < 15 && (NivelDaMissao1 == 'C' || NivelDaMissao1 == 'D')) {
            System.out.println("missao concluida!");
            ConcluiuMissao1 = true;
        }else if(idade1 >= 15) {
            System.out.println("missao concluida!");
            ConcluiuMissao1 = true;
        }else{
            System.out.println("missao nao concluida!");
        }
        if (idade1 < 15 && (NivelDaMissao2 == 'C' || NivelDaMissao2 == 'D')) {
            System.out.println("missao concluida!");
            ConcluiuMissao2 = true;
        }else if(idade2 >= 15) {
            System.out.println("missao concluida!");
            ConcluiuMissao2 = true;
        }else{
            System.out.println("missao nao concluida!");
        }
        if (idade1 < 15 && (NivelDaMissao3 == 'C' || NivelDaMissao3 == 'D')) {
            System.out.println("missao concluida!");
            ConcluiuMissao3 = true;
        }else if(idade3 >= 15) {
            System.out.println("missao concluida!");
            ConcluiuMissao3 = true;
        }else{
            System.out.println("missao nao concluida!");
        }
    }
}
