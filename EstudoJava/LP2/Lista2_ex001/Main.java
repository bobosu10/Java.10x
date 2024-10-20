package LP2.Lista2_ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio1,raio2;
        String cor1,cor2;

        Circulo circulo1 =  new Circulo();
        Circulo circulo2 = new Circulo("azul",5);
        System.out.println("| Dados dos circulos antigos |");
        circulo1.ExibirDados();
        circulo2.ExibirDados();

        do {
            System.out.println("Esse e um programa sobre Circulos e esses valores serao alterados!fale o raio do circulo 1 :");
            raio1 = sc.nextDouble();
            String ternario1 = (raio1 >= 0) ? "|raio valido!|" : "|raio invalido|";
            System.out.println(ternario1);
        }while (raio1<0);

        sc.nextLine();

        System.out.println("Fale a cor do circulo 1 :");
        cor1 = sc.nextLine();

        circulo1.setRaio(raio1);
        circulo1.setCor(cor1);

        do {
            System.out.println("Fale o raio do circulo 2 :");
            raio2 = sc.nextDouble();
            String ternario2 = (raio2 >= 0) ? "|raio valido!|" : "|raio invalido|";
            System.out.println(ternario2);
        }while (raio2<0);

        sc.nextLine();

        System.out.println("Fale a cor do circulo 2 :");
        cor2 = sc.nextLine();

        circulo2.setRaio(raio2);
        circulo2.setCor(cor2);

        System.out.println("==============novos dados==============");
        System.out.println("|        circulo 1        |");
        circulo1.ExibirDados();

        System.out.println("==============novos dados==============");
        System.out.println("|        circulo 2        |");
        circulo2.ExibirDados();




    }
}
