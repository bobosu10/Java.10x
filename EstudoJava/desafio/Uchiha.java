package desafio;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void motrarHabilidade(){
        System.out.println("A habilidade especial do uchiha foi ativada!ela e:"+habilidadeEspecial);
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        motrarHabilidade();
    }
}
