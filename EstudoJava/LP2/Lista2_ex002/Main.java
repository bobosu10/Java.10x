package LP2.Lista2_ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String nome,posicao,nacionalidade;
         double altura,peso;

        int MAX = 40;
        Jogador[] jogadores = new Jogador[MAX];

        for (int i = 0; i < MAX; i++) {
            System.out.println("digite os dados de ate 40 jogadores.se quiser parar antes digite sair ou 0 no peso e altura!");
            System.out.println("Nome :");
            nome = sc.nextLine();
            if(nome.equals("sair")){
                break;
            }
            System.out.println("posicao :");
            posicao = sc.nextLine();
            if(posicao.equals( "sair")){
                break;
            }
            System.out.println("nacionalidade :");
            nacionalidade = sc.nextLine();
            if(nacionalidade.equals( "sair")){
                break;
            }
            System.out.println("altura :");
            altura = sc.nextDouble();
            if(altura <= 0){
                break;
            }
            System.out.println("peso :");
            peso = sc.nextDouble();
            if(peso <= 0){
                break;
            }
            jogadores[i] = new Jogador(altura,nacionalidade,nome,peso,posicao);
            sc.nextLine();

        }
        for (int i = 0; i < MAX; i++) {
            if (jogadores[i] != null ) {
                jogadores[i].ExebirDados();
            }
        }
        sc.close();
    }
}
