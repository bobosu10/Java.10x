package LP2;

import java.util.Scanner;

public class Lista1_ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,a1,r;
        do{
            System.out.println("qual seu n(numero de termos de uma pa!");
            n = sc.nextInt();
        }while (n<0);

        System.out.println("qual seu a1(primeiro termo!)");
        a1 = sc.nextInt();

        System.out.println("qual o seu r(razao da progressao)!");
        r = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("termos : "+a1);
            soma += a1;
            a1 += r;
        }
        System.out.println("resultada da soma: "+soma);
        sc.close();
    }
}
