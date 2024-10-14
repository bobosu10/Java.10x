package LP2;

import java.util.Scanner;

public class Lista1_ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabuada;

        do {
            System.out.println("fala a tabuada ae nengue: ");
            tabuada = sc.nextInt();
            if(tabuada<0){
                System.out.println("menor q zero n nengue e tabuada!");
            }
        }while (tabuada<0);
        for (int i = 1; i <= tabuada; i++) {
            int resultado = tabuada*i;
            System.out.println(tabuada+"x"+i+"="+resultado);
        }
        sc.close();
    }
}
