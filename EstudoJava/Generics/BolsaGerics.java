package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGerics<T> {
    private List<T> equipamentos;

    public BolsaGerics() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Equipamentos da bolsa : "+equipamentos.toString();
    }
}
