package desafio.Desafio6;

import java.util.Comparator;
import java.util.LinkedList;


public record Ninja(String nome ,String vila , int idade) {

    public boolean buscarNinja(String nomebusca){
        return this.nome.equalsIgnoreCase(nomebusca);
    }

    public static Comparator<Ninja> ordenarPorIdade() {
        return Comparator.comparingInt(Ninja::idade);
    }

    public static Comparator<Ninja> ordenarPorNome() {
        return Comparator.comparing(Ninja::nome);
    }

    public static Comparator<Ninja> ordenarPorVila() {
        return Comparator.comparing(Ninja::vila);
    }

    @Override
    public String toString() {
        return "\n============Dados do Ninja============\n |NOME : "+nome+"\n |IDADE : "+idade+"\n |VILA :"+vila;
    }

    public static void ordenarLista(LinkedList<Ninja> lista, int criterio) {
        switch (criterio) {
            case 1 -> lista.sort(ordenarPorIdade());
            case 2 -> lista.sort(ordenarPorNome());
            case 3 -> lista.sort(ordenarPorVila());
            default -> System.out.println("Critério inválido!");
        }
    }
}
