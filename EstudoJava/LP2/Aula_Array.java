package LP2;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        float soma = 0;
        System.out.println("quantos alunos a turma possui?");
        int MAX = sc.nextInt();
        float[] notas = new float[MAX];
        for (int i = 0; i < MAX ; i++) {
            System.out.println("qual sua nota ?");
            notas[i] = sc.nextFloat();
            soma += notas[i];
        }
        float media = soma/MAX;
        System.out.println("essa e a media da turma "+media);
        sc.close();
    }
}
