package LP2Atividade5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transporte> meiosDeTrasporte =  new ArrayList<>();

        Onibus onibus =  new Onibus("Onibus",true);
        Metro metro =  new Metro("Metro",5);
        BicicletaCompartilhada bicicleta = new BicicletaCompartilhada("Bicicleta",2.0);
        Onibus onibus2 = new Onibus("Onibus 2",false);
        meiosDeTrasporte.add(onibus);
        meiosDeTrasporte.add(metro);
        meiosDeTrasporte.add(bicicleta);
        meiosDeTrasporte.add(onibus2);
        System.out.println(onibus.exibirDetalhes()+metro.exibirDetalhes()+bicicleta.exibirDetalhes()+onibus2.exibirDetalhes());
    }
}
