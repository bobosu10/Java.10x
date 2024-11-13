package LP2atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Filme> listaFilmes = new ArrayList<>();

        String titulo,descricao,diretornome,localDeOrigem;
        int duracaoEmMinutos,tempoDeExperiencia,resposta;

        while(true){
            System.out.println("======================FILMES======================\n 1.CADASTRAR FILNES\n 2.BUSCAR FILME\n 3.SAIR");
            System.out.printf("RESPOSTA :");
            resposta = sc.nextInt();
            sc.nextLine();
            if(resposta == 1){
                System.out.println("TITULO : ");
                titulo = sc.nextLine();
                System.out.println("DESCRICAO : ");
                descricao = sc.nextLine();
                System.out.println("DURACAO EM MINUTOS : ");
                duracaoEmMinutos = sc.nextInt();
                sc.nextLine();
                System.out.println("NOME DO DIRETOR : ");
                diretornome = sc.nextLine();
                System.out.println("LOCAL DE ORIGEM DO DIRETOR : ");
                localDeOrigem = sc.nextLine();
                System.out.println("TEMPO DE EXPERIENCIA DO DIRETOR EM ANOS: ");
                tempoDeExperiencia = sc.nextInt();

                Diretor novodiretor = new Diretor(localDeOrigem,diretornome,tempoDeExperiencia);
                Filme novofilme = new Filme(descricao,novodiretor,duracaoEmMinutos,titulo);
                listaFilmes.add(novofilme);

            }else if(resposta == 2){
                System.out.println("NOME DO FILME QUE DESEJA BUSCAR : ");
                String buscaTitulo = sc.nextLine();
                System.out.println(Filme.buscaFilme(buscaTitulo,listaFilmes));
            }else if(resposta == 3){
                for (Filme p : listaFilmes){
                    System.out.println("=====================================");
                    System.out.println(p.getTitulo());
                    System.out.println(p.exibirDuracaoEmHoras());
                    System.out.println("=====================================");
                }
                System.out.println("#########################adeus#########################");
                break;
            }else {
                System.out.println("resposta invalida tente novamente!");
            }

        }

    }
}
