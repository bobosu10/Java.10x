package LP2.Lista3_ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta,inverso = "" ;

        System.out.println("digite sua string :");
        resposta = sc.nextLine();
        int cont = 0;

        for (int i = 0; i < resposta.length(); i++) {
            String respostamin = resposta.toLowerCase();
            if (respostamin.charAt(i)  == 'a' || respostamin.charAt(i)  == 'e' || respostamin.charAt(i)  == 'i' || respostamin.charAt(i)  == 'o' || respostamin.charAt(i)  == 'u') {
                cont++;
            }
        }

        System.out.println("numero de caracteres da string : "+resposta.length());
        System.out.println("string maiuscula : "+resposta.toUpperCase());
        System.out.println("numero de vogais: "+cont);

        if(resposta.startsWith("a")){
            System.out.println("string comeca com A");
        }else {
            System.out.println("nao comeca com A");
        }
        if(resposta.startsWith("o")){
            System.out.println("string comeca com O");
        }else {
            System.out.println("nao comeca com O");
        }
        for (int i = resposta.length()-1; i >= 0; i--) {
                inverso += resposta.charAt(i);
            }
        if(inverso.equals(resposta)) {
            System.out.println("e palindrome : " + inverso);
        }else {
            System.out.println("nao e palindrome");
        }
    }
}
