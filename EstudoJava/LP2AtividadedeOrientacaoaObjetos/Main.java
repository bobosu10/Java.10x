package LP2AtividadedeOrientacaoaObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largura1,altura1,largura2,altura2;

        Retangulo retangulo1 = new Retangulo(4,5);
        Retangulo retangulo2 = new Retangulo(10,14);
        double Area1 = retangulo1.calcularArea(4,5);
        double Area2 = retangulo2.calcularArea(10,14);
        double Perimetro1 = retangulo1.calcularPerimetro(4,5);
        double Perimetro2 = retangulo2.calcularPerimetro(10,14);
        System.out.println("|        retangulo 1        |");
        retangulo1.exiberDados(4,5,Area1,Perimetro1);
        System.out.println("|        retangulo 2        |");
        retangulo2.exiberDados(10,14,Area2,Perimetro2);

        System.out.println("=================================================================");

        do {
            System.out.println("Esse e um programa sobre retangulos e esses valores serao alterados!fale a largura do retangulo 1 :");
            largura1 = sc.nextDouble();
            String ternario1 = (largura1 >= 0) ? "|largura valida!|" : "|largura invalida|";
            System.out.println(ternario1);
        }while (largura1<0);
        do {
            System.out.println("Fale a altura do retangulo 1:");
            altura1 = sc.nextDouble();
            String ternario2 = (altura1>=0) ? "|altura valida!|" : "|altura invalida|";
            System.out.println(ternario2);
        }while (altura1<0);

        retangulo1.setLargura(largura1);
        retangulo1.setAltura(altura1);
        Area1 = retangulo1.calcularArea(largura1,altura1);
        Perimetro1 = retangulo1.calcularPerimetro(largura1,altura1);

        do {
            System.out.println("Vamos para o retangulo 2!fale a largura do retangulo 2 :");
            largura2 = sc.nextDouble();
            String ternario3 = (largura2 >= 0) ? "|largura valida!|" : "|largura invalida|";
            System.out.println(ternario3);
        }while (largura2<0);
        do {
            System.out.println("Fale a altura do retangulo 2:");
            altura2 = sc.nextDouble();
            String ternario4 = (altura2 >= 0) ? "|altura valida!|" : "|altura invalida|";
            System.out.println(ternario4);
        }while (altura2<0);

        retangulo2.setLargura(largura2);
        retangulo2.setAltura(altura2);
        Area2 = retangulo2.calcularArea(largura2,altura2);
        Perimetro2 = retangulo2.calcularPerimetro(largura2,altura2);

        System.out.println("==============novos dados==============");
        System.out.println("|        retangulo 1        |");
        retangulo1.exiberDados(altura1,largura1,Area1,Perimetro1);
        System.out.println("|        retangulo 2        |");
        retangulo2.exiberDados(altura2,largura2,Area2,Perimetro2);

        sc.close();
    }
}
