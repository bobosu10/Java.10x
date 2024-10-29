package AulaLp2;


public class Aluno {
    private String matricula,nome;
    private int idade;

    public Aluno() {
    }

    public Aluno(String matricula , String nome,int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean bucarAluno(String nomebusca){
        return this.nome.equalsIgnoreCase(nomebusca);
    }

    @Override
    public String toString(){
        return String.format(
                "\uD83D\uDCDA ALUNOS CADASTRADOS \uD83D\uDCDA \n NOME : "+nome+"\n MATRICULA : "+matricula+"\n IDADE : "+idade
        );
    }

}
