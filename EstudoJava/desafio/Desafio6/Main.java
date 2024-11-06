package desafio.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome,vila;
        int idade;

        LinkedList<Ninja> linkedListNinja =  new LinkedList<>();
            linkedListNinja.add( new Ninja("Naruto Uzumaki","Aldeia da folha",34));
            linkedListNinja.add( new Ninja("Naruto Uzumaki","Aldeia da folha",34));
            linkedListNinja.add(new Ninja("Sakura Haruno","Aldeia da folha",34));
            linkedListNinja.add(new Ninja("Boruto Uzumaki","Aldeia da folha",16));
            linkedListNinja.add(new Ninja("Sarada Uchiha","Aldeia da folha",16));
            linkedListNinja.add(new Ninja("Kawaki Uzumaki","Aldeia da folha",16));
            linkedListNinja.add(new Ninja("Kakashi Hatake","Aldeia da folha",50));

        while(true){
            System.out.println("=========================MENU NINJA=========================\n |1.ADICIONAR UM NOVO NINJA NO INICIO|\n |2.REMOVER O PRIMEIRO NINJA|\n |3.EXIBIR LISTA COMPLETA|\n |4.BUSCAR NINJA|\n |5.ORDENACAO NINJA|\n |6.SAIR|");
            System.out.printf("resposta :");
            int resposta =  sc.nextInt();
            sc.nextLine();

            if(resposta == 1){
                System.out.println("Nome do Ninja :");
                nome = sc.nextLine();
                if(nome.equals("sair")){
                    System.out.println("Encerrando o programa...\n =======================ADEUS=======================");
                    break;
                }
                System.out.println("Vila do Ninja :");
                vila = sc.nextLine();
                if(vila.equals("sair")){
                    System.out.println("Encerrando o programa...\n =======================ADEUS=======================");
                    break;
                }
                System.out.println("Idade do Ninja :");
                idade = sc.nextInt();
                sc.nextLine();
                if(idade<0){
                    System.out.println("Encerrando o programa...\n =======================ADEUS=======================");
                    break;
                }
                linkedListNinja.addFirst(new Ninja(nome,vila,idade));

            }else if(resposta == 2){
                System.out.println("O programa removera o Ninja na primeira posicao.");
                Ninja remove = linkedListNinja.removeFirst();
                System.out.println("Nova lista :\n"+linkedListNinja);
            }else if(resposta == 3){
                System.out.println("================================================\nExibindo lista completa :\n"+linkedListNinja);
            } else if (resposta == 4) {
                System.out.printf("Nome do Ninja que deseja busca : ");
                String nomebusca = sc.nextLine();
                boolean encontrado = false;
                for (Ninja p : linkedListNinja){
                    if(p.buscarNinja(nomebusca)){
                        System.out.println("Ninja encontrado!");
                        System.out.println(p);
                        encontrado = true;
                        break;
                    }
                }
                if(!encontrado){
                    System.out.println("Ninja nao encontrado!");
                }

            } else if (resposta == 5) {
                System.out.printf("ESCOLHA O CRITERIO DE ORDENACAO :\n |1.IDADE|\n |2.NOME|\n |3.VILA|\n Resposta :");
                int criterio = sc.nextInt();
                Ninja.ordenarLista(linkedListNinja, criterio);
                System.out.println("Lista ordenada:\n" + linkedListNinja);
            } else if(resposta == 6){
                System.out.println("Encerrando o programa...\n =======================ADEUS=======================");
                break;
            }else {
                System.out.println("|Resposta do usuario invalida|");
            }

        }
    sc.close();
    }
}
