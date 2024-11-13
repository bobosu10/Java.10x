package LP2.Lista3_ex005;

public class Aluno {
    private String matricula,nome;
    private double nota1,nota2,media;

    public Aluno() {
    }

    public Aluno(String matricula , String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = calcularMedia();

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
        this.media = calcularMedia();
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
        this.media = calcularMedia();
    }

    public double calcularMedia(){
        return (nota1+nota2)/2;
    }

    public boolean bucarAluno(String nomebusca){
        return this.nome.equalsIgnoreCase(nomebusca);
    }

    @Override
    public String toString(){
        return String.format(
                "\uD83D\uDCDA ALUNOS CADASTRADOS \uD83D\uDCDA \n NOME : "+nome+"\n MATRICULA : "+matricula+"\n NOTA1 : "+nota1+"\n NOTA2 : "+nota2+"\n MEDIA : "+calcularMedia()
        );
    }



}
