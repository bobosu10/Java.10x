package Pilhas_Stack;

import javax.print.attribute.standard.QueuedJobCount;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Qual a diferença entre uma List e um ArrayList ?
        //Um é a interface outro a implementacao


        //Array comum , SAO ESTATICOS E COM REF EM MEMORIA
        String[] ninjasArray =  new String[3];

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
        System.out.println("Ninjas na fila : "+ninjaQueue);

        //TIRAR DA FILA
        ninjaQueue.poll();
        System.out.println("Ninjas na fila depois do POLL : "+ninjaQueue);

        System.out.println("Ninja no HEAD: "+ninjaQueue.peek());

        ninjaQueue.add("Hashirama");
        ninjaQueue.add("Tobirama");

        System.out.println("Ninjas na fila 2: "+ninjaQueue);

        //NAO DA PRA DELETAR O TAIL

        if(ninjaQueue.isEmpty()){
            System.out.println("A queue esta vazia!");
        }
    }
}
