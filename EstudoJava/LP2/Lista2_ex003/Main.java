package LP2.Lista2_ex003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1,l2,l3;

        Triangulo triangulo1 = new Triangulo(4,4,4);
        Triangulo triangulo2 = new Triangulo(4,4,7);
        triangulo1.ExebirDados();
        triangulo2.ExebirDados();
        System.out.println("Iremos mudar os dados dos triangulos!diga seu l1 do triangulo 1 :");
        l1 = sc.nextDouble();
        System.out.println("Diga seu l2 do triangulo 1 :");
        l2 = sc.nextDouble();
        System.out.println("Diga seu l3 do triangulo 1 :");
        l3 = sc.nextDouble();

        triangulo1.setL1(l1);
        triangulo1.setL2(l2);
        triangulo1.setL3(l3);

        System.out.println("Iremos mudar os dados dos triangulos!diga seu l1 do triangulo 2 :");
        l1 = sc.nextDouble();
        System.out.println("Diga seu l2 do triangulo 1 :");
        l2 = sc.nextDouble();
        System.out.println("Diga seu l3 do triangulo 1 :");
        l3 = sc.nextDouble();
        triangulo2.setL1(l1);
        triangulo2.setL2(l2);
        triangulo2.setL3(l3);

        triangulo1.ExebirDados();
        triangulo2.ExebirDados();
        sc.close();
    }
}
