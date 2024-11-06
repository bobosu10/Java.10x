package Stack_Queue_LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Qual a diferença entre uma List e um ArrayList ?
        //Um é a interface outro a implementacao


        //Array comum , SAO ESTATICOS E COM REF EM MEMORIA
        String[] ninjasArray = new String[3];

        //DAQUI PRA FRENTE E TUDO COLLECTIONS

        //Lista, SAO DINAMICAS E DIMINUI CONFORME PRECISA
        List<String> ninjasList = new ArrayList<>();

        //Pilha O ULTIMO A ENTRAR E O PRIMEIRO A SAIR
        //PUSH(ADICIONA),POP(RETIRAR),PEEK(TOPO DA LISTA),SIZE(TAMANHO)
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Boruto Uzumaki");
        ninjasStack.push("Sarada Uchiha");
        ninjasStack.push("Himawari Uzumaki");
        System.out.println(ninjasStack.peek());
        System.out.println(ninjasStack);
        System.out.println(ninjasStack.size());
        ninjasStack.pop();
        System.out.println(ninjasStack);
        System.out.println(ninjasStack.size());

        //QUEUE = FILA PRIMEIRO A ENTRAR PRIMEIRO A SAIR

        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Shikamaru");
        //MOSTRAR FILA
        System.out.println("Ninjas na fila : " + ninjaQueue);

        //TIRAR DA FILA
        ninjaQueue.poll();
        System.out.println("Ninjas na fila depois do POLL : " + ninjaQueue);

        System.out.println("Ninja no HEAD: " + ninjaQueue.peek());

        ninjaQueue.add("Hashirama");
        ninjaQueue.add("Tobirama");

        System.out.println("Ninjas na fila 2: " + ninjaQueue);

        //NAO DA PRA DELETAR O TAIL

        if (ninjaQueue.isEmpty()) {
            System.out.println("A queue esta vazia!");
        }

        //LINKED LIST!!!
        LinkedList<String> linkedListNinja = new LinkedList<>();
        linkedListNinja.add("Madara Uchiha");
        linkedListNinja.add("Itachi Uchiha");
        linkedListNinja.add("Shizui Uchiha");

        System.out.println(linkedListNinja);

        linkedListNinja.add(1,"Sasuke Uchiha");
        System.out.println(linkedListNinja);

        linkedListNinja.remove(2);
        System.out.println(linkedListNinja);


        Ninjas naruto = new Ninjas(18, "Naruto Uzumaki", "Aldeia da folha");
        Ninjas sasuke = new Ninjas(18, "Sasuke uchiha", "Aldeia da folha");
        Ninjas sakura = new Ninjas(18, "Sakura Haruno", "Aldeia da folha");
        Ninjas kakashi = new Ninjas(42, "Kakashi Hatake", "Aldeia da folha");

        naruto.proximo = sasuke;
        sasuke.proximo = sakura;
        sakura.proximo = kakashi;
        kakashi.proximo = null;

        //PERCORRER A LINKED LIST E PRINTAR

        Ninjas atual = naruto;
        while (atual != null) {
            System.out.println("Nome : "+atual.nome + "|idade :"+atual.idade+"|vila :"+atual.vila);
            atual = atual.proximo; //move para o proximo no
        }
    }
}
