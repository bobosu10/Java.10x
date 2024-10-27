package LP2.Lista3_ex005;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int resposta;
        String nome,matricula;
        double nota1,nota2;


        while(true){
            System.out.println("======================menu dos alunos======================\n 1.CADASTRAR ALUNO\n 2.BUSCAR ALUNO\n 3.EXIBIR LISTA DE ALUNOS\n 4.MEDIA DA TURMA\n 5.SAIR");
            resposta = sc.nextInt();
            sc.nextLine();
            if(resposta == 1){
                System.out.println("NOME : ");
                nome = sc.nextLine();
                System.out.println("MATRICULA : ");
                matricula = sc.nextLine();
                System.out.println("NOTA1 : ");
                nota1 = sc.nextInt();
                sc.nextLine();
                System.out.println("NOTA2 : ");
                nota2 = sc.nextInt();
                sc.nextLine();
                Aluno aluno = new Aluno(matricula,nome,nota1,nota2);
                alunos.add(aluno);
            }else if(resposta == 2){
                System.out.println("NOME DO ALUNO QUE DESEJA BUSCAR : ");
                String nomebusca = sc.nextLine();
                boolean encontrado = false;
                for (Aluno p : alunos) {
                    if(p.bucarAluno(nomebusca)){
                        System.out.println(p);
                        encontrado = true;
                        break;
                    }
                }
                if(!encontrado){
                    System.out.println("Aluno nao encontrado!");
                }
            }else if(resposta == 3){
                for (Aluno p : alunos)
                    System.out.println(p);
            }else if(resposta == 4){
                double mediaDaTurma = 0;
                for (Aluno p : alunos) {
                    mediaDaTurma += p.calcularMedia() / alunos.size();
                }
                System.out.println("MEDIA DA TURMA : "+mediaDaTurma);
            }else if(resposta == 5){
                System.out.println("======================adeus======================");
                break;
            }else {
                System.out.println("resposta invalida tente novamente!");
            }

        }

    }
}
