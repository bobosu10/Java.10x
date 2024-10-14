import java.util.Scanner;

public class MeuPrimeiroPrograma {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite seu id:");
      int id = sc.nextInt();

      System.out.println("nota1:");
      double n1 = sc.nextDouble();
      System.out.println("nota2:");
      double n2 = sc.nextDouble();
      System.out.println("nota3:");
      double n3 = sc.nextDouble();

      System.out.println("média dos exercícios (ME)");
      double ME = sc.nextDouble();

      double MA = (n1+n2*2+n3*3+ME)/7;

      System.out.printf("id do aluno:%d%n",id);
      System.out.printf("notas:%.2f %.2f %.2f%n",n1,n2,n3);
      System.out.printf("media dos exercicios:%.2f%n",ME);
      System.out.printf("media de aproveitamento:%.2f%n",MA);

      sc.close();

      if(MA >= 9){
          System.out.println("Conceito A.");
          System.out.println("Aprovado.");
      }else if(MA >= 7.5){
          System.out.println("Conceito B.");
          System.out.println("Aprovado.");
      }else if(MA >= 6 ){
          System.out.println("Conceito C.");
          System.out.println("Aprovado.");
      }else if(MA >= 4){
          System.out.println("Conceito D.");
          System.out.println("Reprovado.");
      }else {
          System.out.println("Conceito E.");
          System.out.println("Reprovado.");
      }
    }
}
