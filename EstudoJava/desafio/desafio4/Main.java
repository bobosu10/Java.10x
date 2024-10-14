package desafio.desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Rasengan",18,"Naruto Uzumaki",TipoDeHabilidade.NINJUTSU);
        naruto.mostrarInformacoes();
        naruto.executarHabilidades();
        
        System.out.println("============================================================");
        
        NinjaAvancado madara = new NinjaAvancado("Chama do dragao",200,"Madara Uchiha",TipoDeHabilidade.NINJUTSU,"Rinnegan!");
        madara.mostrarInformacoes();
        madara.executarHabilidades();
        madara.executarEspecialidade();

    }
}
