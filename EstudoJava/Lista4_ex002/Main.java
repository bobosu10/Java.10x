package LP2.Lista4_ex002;

public class Main {
    public static void main(String[] args) {
        Equipamento novoEquipamento =  new Equipamento(false,"TV");
        EquipamentosSonoros novoSonoro =  new EquipamentosSonoros(false,"JBL",false,(short)0);

        System.out.println(novoEquipamento.ligar());
        System.out.println(novoEquipamento.desligar());

        System.out.println(novoSonoro.ativarMono());
        System.out.println(novoSonoro.ativarStereo());

        System.out.println(novoSonoro.ligar());
        System.out.println(novoSonoro.desligar());

        System.out.println(novoSonoro.ativarMono());
        System.out.println(novoSonoro.ativarStereo());









    }
}
