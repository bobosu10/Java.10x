package desafio;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        String[] Ninjas = new String[14];

        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        while(opcao > 3 || opcao < 1) {
            System.out.println("erro de digitacao,macaco!");
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
        }

        while(opcao != 3){
            System.out.println("to certo!");

            switch (opcao){
                case 1:
                    System.out.println("qual nome do seu ninja?(caso deseje encerrar escreva done)");
                    String ninja = sc.nextLine();
                    while(!ninja.equalsIgnoreCase("done")){
                        Ninjas[contador] = ninja;
                        contador++;
                        if(contador == Ninjas.length){
                            System.out.println("Limite de ninjas atingido.");
                            break;
                        }
                        System.out.println("Digite o nome de outro ninja ou 'done' para encerrar:");
                        ninja = sc.nextLine();
                    }
                    break;


                case 2:
                    if(contador == 0){
                        System.out.println("sem ninjas cadastrados!");
                    }else {
                        System.out.println("lista de ninjas cadastrados...");
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". " + Ninjas[i]);
                        }
                    }
                    break;
            }
            System.out.println("\n1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
        }
    sc.close();
        System.out.println("Programa encerrado.datebayo!");
    }
}
