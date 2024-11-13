package LP2atividade4;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private String descricao;
    private Diretor diretor;
    private int duracaoEmMinutos;

    public Filme(String descricao) {
        this.descricao = descricao;
    }

    public Filme(String descricao, Diretor diretor, int duracaoEmMinutos, String titulo) {
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String exibirDuracaoEmHoras(){
        int horas = duracaoEmMinutos/60;
        int minutos = duracaoEmMinutos%60;
        return "O filme "+titulo+" possui "+horas+" horas e "+minutos+" minutos de duração.";
    }

    public static String buscaFilme(String buscaTitulo, ArrayList<Filme> filmes){
        for (Filme p : filmes){
            if (buscaTitulo.equalsIgnoreCase(p.getTitulo())){
                return p.exebirDados();
            }
        }
        return "FILME NAO ENCONTRADO.";
    }

    public String exebirDados(){
        return "Filme{" +
                "descricao='" + descricao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", diretor=" + diretor +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
