package LP2.Lista4_ex001;

public class Main {
    public static void main(String[] args) {
        Peixe novoPeixe = new Peixe("Bahia de guanabara",25,"vemelho","Peixao",0,5,"Sim","Sim");
        Mamifero novoMamifero =  new Mamifero("floresta",4,"cinza","macaco cinza",4,10,"frutas");
        System.out.println("============================================================================");
        novoMamifero.exibirDados();
        System.out.println("============================================================================");
        novoPeixe.exibirDados();




    }
}
