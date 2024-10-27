package LP2.Lista3_ex001;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] vet =  new int[50];
        int cont = 101;
        ArrayList<Integer> vet2 = new ArrayList<Integer>();


        //TODO versao com ArrayList
        for (int i = 101; i < 151; i++) {
            vet2.add(i);
        }
        System.out.println(vet2);

        //TODO versao ugabuga
        for (int i =0; i < 50; i++) {
            vet[i] = cont;
            cont++;
        }
        for (int i =0; i < 50; i++) {
            System.out.println(vet[i]) ;
        }
    }
}
