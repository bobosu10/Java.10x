package LP2;

import java.util.Scanner;

public class Lista1_ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario;
        float prestacao;
        do {
            System.out.println("qual o seu salario bruto?");
            salario = sc.nextFloat();
            String deuruim = (salario<0) ? "salario errado" : "bom salario nengue";
            System.out.println("qual o valor da prestacao?");
            prestacao = sc.nextFloat();
        }while (salario < 0 || prestacao < 0);


        float MAX = salario * 0.3f;
        if (prestacao <= MAX) {
            System.out.println("emprestimo aprovado nengue!");
        }else{
            System.out.println("se fudeu nengue!");
        }
        sc.close();
    }
}
