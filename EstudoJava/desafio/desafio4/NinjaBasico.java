package desafio.desafio4;

public class NinjaBasico implements Ninja {
    private String nome,habilidade;
    private int idade;
    private TipoDeHabilidade tipo;

    public NinjaBasico(String habilidade, int idade, String nome, TipoDeHabilidade tipo) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeHabilidade getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeHabilidade tipo) {
        this.tipo = tipo;
    }

    public void mostrarInformacoes(){
        System.out.println("NOME : "+nome+"|IDADE : "+idade);
    }

    public void executarHabilidades(){
        System.out.println("minha habilidade e do tipo "+tipo+"."+"Ativar habilidade especial : "+habilidade);

    }
}


