package NivelIntermediario6;

public class Main {
    public static void main(String[] args) {
        EquipamentosNinja kunai =  new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken =  new EquipamentosNinja("Shuriken gigante");
        EquipamentosNinja pergaminho =  new EquipamentosNinja("Pergaminho sagrado");

        BolsaGeneric<EquipamentosNinja> bolsaGenerica= new BolsaGeneric<>();

        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
