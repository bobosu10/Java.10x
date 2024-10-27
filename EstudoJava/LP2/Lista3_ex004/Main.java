package LP2.Lista3_ex004;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();

        String nome, sigla;
        int populacao, dimensao;

        while (true) {
            System.out.println("====================cadastro de paises====================\n |se desejar sair digire {sair}|");
            System.out.println("NOME DO PAIS : ");
            nome = sc.nextLine();
            if (nome.equals("sair")){
                System.out.println("BYE THANKS");
                break;
            }
            System.out.println("SIGLA DO PAIS : ");
            sigla = sc.nextLine();
            if (sigla.equals("sair")){
                System.out.println("BYE THANKS");
                break;
            }
            System.out.println("POPULACAO DO PAIS : ");
            populacao = sc.nextInt();
            if (populacao == 0){
                System.out.println("BYE THANKS");
                break;
            }
            System.out.println("DIMENSAO DO PAIS : ");
            dimensao = sc.nextInt();
            if (dimensao == 0){
                System.out.println("BYE THANKS");
                break;
            }
            sc.nextLine();
            Pais pais = new Pais(dimensao, nome, populacao, sigla);
            paises.add(pais);
        }
            for (Pais p : paises) {
                System.out.println(p);
            }
            sc.close();
    }
}
