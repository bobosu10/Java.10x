package Condicao;

public class Arrays {
    public static void main(String[] args) {
        String[][] ninjasEaldeias = new String[2][2];

        ninjasEaldeias[0][0] = "Konoha";
        ninjasEaldeias[0][1] = "Boruto uzumaki";

        ninjasEaldeias[1][0] = "areia";
        ninjasEaldeias[1][1] = "gaara";

        for (int i = 0; i < ninjasEaldeias.length ; i++) {
            System.out.println("esse ninja e da aldeia de "+ninjasEaldeias[i][0]+" e seu nome e "+ninjasEaldeias[i][1]);

        }


    }
}
