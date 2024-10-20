package desafio.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userTipo, resposta;
        double valor;
        ContaCorrente cc = new ContaCorrente(0, TipoConta.CORRENTE);
        ContaPoupanca cp = new ContaPoupanca(0, TipoConta.POUPANCA);

        do {
            System.out.println("Ola ninja de konoha!qual voce deseja acessar a conta corrente ou poupanca | caso queira sair digite [sair] :");
            userTipo = sc.nextLine().toUpperCase();

            if (userTipo.equals("CORRENTE")) {
                System.out.println("============================================");
                cc.consultarSaldo();
                System.out.println("voce deseja depositar na sua conta " + userTipo + " ou transferir ?");
                resposta = sc.nextLine().toUpperCase();
                if (resposta.equals("DEPOSITAR")) {
                    System.out.println("valor a ser depositado :");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    cc.depositar(valor);
                } else if (resposta.equals("NAO")) {
                    System.out.println("============================================");
                    System.out.println("voltando ao inicio!Esses sao seus dados :");
                    cc.consultarSaldo();
                    cp.consultarSaldo();
                    System.out.println("============================================");
                } else if (resposta.equals("TRANSFERIR")) {
                    System.out.println("============================================");
                    System.out.println("Voce deseja transferir tudo ou um valor ?");
                    resposta = sc.nextLine().toUpperCase();
                    if (resposta.equals("TUDO")) {
                        System.out.println("============================================");
                        cc.transferencia(cp);
                        System.out.println("============================================");
                    } else if (resposta.equals("VALOR")) {
                        System.out.println("============================================");
                        System.out.println("valor a ser transferido :");
                        valor = sc.nextDouble();
                        sc.nextLine();
                        cc.transferencia(cp, valor);
                        System.out.println("============================================");
                    }
                }
            } else if (userTipo.equals("POUPANCA")) {
                System.out.println("============================================");
                cp.consultarSaldo();
                System.out.println("voce deseja depositar na sua conta " + userTipo + " ou transferir?");
                resposta = sc.nextLine().toUpperCase();
                if (resposta.equals("DEPOSITAR")) {
                    System.out.println("valor a ser depositado :");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    cp.depositar(valor);
                } else if (resposta.equals("NAO")) {
                    System.out.println("============================================");
                    System.out.println("voltando ao inicio!Esses sao seus dados :");
                    cc.consultarSaldo();
                    cp.consultarSaldo();
                    System.out.println("============================================");
                } else if (resposta.equals("TRANSFERIR")) {
                    System.out.println("============================================");
                    System.out.println("Voce deseja trasnferir tudo ou um valor ?");
                    resposta = sc.nextLine().toUpperCase();
                    if (resposta.equals("TUDO")) {
                        System.out.println("============================================");
                        cp.transferencia(cc);
                        System.out.println("============================================");
                    } else if (resposta.equals("VALOR")) {
                        System.out.println("============================================");
                        System.out.println("valor a ser transferido :");
                        valor = sc.nextDouble();
                        sc.nextLine();
                        cp.transferencia(cc, valor);
                        System.out.println("============================================");
                    }
                }
            }
        }while (!userTipo.equals("SAIR")) ;
         sc.close();
    }
}

