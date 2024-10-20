package desafio.desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidade;

    public NinjaAvancado(String habilidade, int idade, String nome, TipoDeHabilidade tipo, String especialidade) {
        super(habilidade, idade, nome, tipo);
        this.especialidade = especialidade;
    }

    public void executarEspecialidade(){
        System.out.println("Preparece!essa e minha habilidade secreta "+especialidade+"!");
    }
}
