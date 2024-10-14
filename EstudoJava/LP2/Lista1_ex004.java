package LP2;

import java.util.Scanner;

public class Lista1_ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0,countpar = 0,countimpar = 0;
        do {
            System.out.println("fala um numero ae quando quiser parar so digitar num negativo");
            num = sc.nextInt();
            if(num%2 == 0 && num > 0 ){
                countpar++;
            }else if(num%2 != 0 && num > 0 ){
                countimpar++;
            }
        }while(num>0);
        System.out.println("numero de par = "+countpar+"-------------numero de impar = "+countimpar);
        sc.close();
    }
}

