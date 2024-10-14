package Condicao;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-rasengan");
        System.out.println("2-chidori");
        System.out.println("3-suzano");
        int jutsu = sc.nextInt();

        switch (jutsu){
            case 1:
                System.out.println("vc escolheu rasengan do naruto!");
                break;
            case 2:
                System.out.println("vc escolheu chidori do sasuke!");
                break;
            case 3:
                System.out.println("vc escolheu o suzano dos uchiha e bom ter uns olhos de sobra!");
                break;
        }
        sc.close();
    }
}
