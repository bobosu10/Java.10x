package Lp2Atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo,telefone,resposta,cont = 0,max = 50;
        String resposta2,nome,cpf;
        Cliente[] clientes = new Cliente[max];

        while (true){
            System.out.println("=========================bem vindo ao menu do cliente =========================\n"+" 1.Cadastrar cliente\n 2.Bucar cliente\n 3.Exibir dados dos clientes\n 4.Sair");
            System.out.printf("OPCAO : ");
            resposta = sc.nextInt();
            sc.nextLine();
            if (resposta == 1){
                System.out.println("NOME :");
                nome = sc.nextLine();
                System.out.println("CPF :");
                cpf = sc.nextLine();
                System.out.println("CODIGO :");
                codigo = sc.nextInt();
                System.out.println("TELEFONE :");
                telefone = sc.nextInt();
                clientes[cont] = new Cliente(codigo,cpf,nome,telefone);
                cont++;
            }else if (resposta == 2) {
                if (cont > 0) {
                    System.out.println("qual o nome vc deseja buscar :");
                    nome = sc.nextLine();
                    String result = Cliente.buscarCliente(nome, clientes, cont);
                    System.out.println(result);
                    if (result.contains("bem vindo")) {
                        System.out.println("deseja exebir os seus dados " + nome + "?");
                        resposta2 = sc.nextLine();
                        if (resposta2.equals("sim")) {
                            for (int i = 0; i < cont; i++) {
                                if (clientes[i].getNome().equals(nome)) {
                                    clientes[i].exibirDados();
                                }
                            }
                        } else {
                            System.out.println("Tudo bem, voltando ao menu");
                        }
                    }
                }else {
                    System.out.println("nenhum cliente registrado.");
                }
            }else if(resposta == 3){
                if (cont == 0){
                    System.out.println("nenhum cliente registrado.");
                }
                for (int i = 0; i < cont; i++) {
                    clientes[i].exibirDados();
                }
            } else if (resposta == 4) {
                System.out.println("obrigado por usar o programa,adeus!");
                break;
            }else {
                System.out.println("resposta invalida,tente novamente");
            }
        }
    sc.close();
    }
}
