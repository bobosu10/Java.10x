package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        //criar ninja sasuke uchiha - sasuke e um objeto!

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto uzumaki";
        naruto.aldeia = "aldeia da folha";
        naruto.idade = 42;
        naruto.modosabio();

        //String nome = "Naruto uzamaki";
        //int idade = 18;
        //String aldeia = "aldeia da folha";

        System.out.println("A idade do ninja e: "+ naruto.idade);
        System.out.println("=====================================");

        //criar ninja sasuke uchiha - sasuke e um objeto!

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "sasuke uchiha";
        sasuke.aldeia = "aldeia da folha";
        sasuke.idade = 42;
        sasuke.SharinganAtivado();
        //aplicando metodos aos meus objetos!
        String chamametodo = sasuke.EuSouUmNinja();
        System.out.println(chamametodo);
        int quantoTempoFalta = sasuke.anosParaSeTornarHokage(70);
        System.out.println("vc tem: "+sasuke.idade+" entao falta no minimo:"+quantoTempoFalta+"anos para vc ser hokage!");
        System.out.println("=====================================");
        //criando a hinata hyuga

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "aldeia da folha";
        hinata.idade = 42;
        hinata.ByakuganAtivado();
        System.out.println("=====================================");

        //criando Boruto

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 15;
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();
        Boruto.modosabio();

    }

}
