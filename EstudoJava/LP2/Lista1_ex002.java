package LP2;

import java.util.Scanner;

public class Lista1_ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int maiornum = 0;
        for (int i = 0; i < 15 ; i++) {
            do {
                System.out.println("fala um N nengue");
                N = sc.nextInt();
                if (N<0){
                    System.out.println("negativo nao nengue");
                }
            }while (N<0);
            if(N > maiornum){
                maiornum = N;
            }
        }
        System.out.println("o maior numero lido e: "+maiornum);
        sc.close();
    }
}
