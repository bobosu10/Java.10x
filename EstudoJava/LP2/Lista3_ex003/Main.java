package LP2.Lista3_ex003;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner( System.in);

        System.out.println("digite sua frase : ");
        String resposta = sc.nextLine();
        int cont = resposta.length();
        int contPalavra = 0;
        for (int i = 0; i < resposta.length(); i++) {
            if(resposta.charAt(i) == ' '){
                cont--;
                contPalavra++;
            }
        }
        if(contPalavra>0){
            contPalavra ++;
        }

        System.out.println("Essa foi a sua frase :"+resposta);
        System.out.println("Numero de caracteres :"+cont);
        System.out.println("Numero de palavras :"+contPalavra);
    }
}
