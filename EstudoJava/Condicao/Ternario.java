package Condicao;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas missoes seu ninja conclui ein?");
        int numeromissoes = sc.nextInt();
        String upgrade = (numeromissoes >= 20) ? "numero de missoes suficiente para upgrade" : "numero de missoes insuficiente";
        System.out.println(upgrade);
    }
}
