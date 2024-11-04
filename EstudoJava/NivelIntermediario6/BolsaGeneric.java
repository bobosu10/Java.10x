package NivelIntermediario6;

import java.util.ArrayList;
import java.util.List;

public class BolsaGeneric<T> {
    private List<T> equipamentos;

    public BolsaGeneric() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos :"+equipamentos.toString();
    }
}
