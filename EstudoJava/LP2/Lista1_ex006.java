package LP2;

import java.util.Scanner;

public class Lista1_ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0,y = 0;
        do {
            System.out.println("fala o teu x positivo:");
            x = sc.nextInt();
            if(x<0){
                System.out.println("negativo nao nengue!");
            }
        }while (x<0);
        do {
            System.out.println("fala teu y positivo");
            y = sc.nextInt();
            if(y<0){
                System.out.println("negativo nao nengue!");
            }
        }while (y<0);

        int potencia = x;
        if(y==0){
            potencia = 1;
        }
        for (int i = 1; i < y ; i++) {
            potencia *= x;
        }
        System.out.println("toma: "+potencia);

    }
}
