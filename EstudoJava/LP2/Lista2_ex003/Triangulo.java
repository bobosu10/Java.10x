package LP2.Lista2_ex003;


public class Triangulo {
    private double l1;
    private double l2;
    private double l3;

    public Triangulo() {
    }

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public String TipoTriangulo(){
        String tipo = null;

        if(l1 == l2 && l1 == l3){
            tipo = "Equilatero";
        }else if(l1 == l2 || l1 == l3 || l2 == l3){
            tipo = "isosceles";
        }else if(l1 != l2 && l1 != l3 && l2 != l3) {
            tipo = "escaleno";
        }
        return tipo;
    }
    public void ExebirDados(){
        System.out.println("Dados do Triangulo");
        System.out.println("=============================================");
        System.out.println("l1 : "+l1+"| l2 : "+l2+"| l3 : "+l3);
        System.out.println("tipo do triangulo : "+TipoTriangulo());
        System.out.println("=============================================");
    }
}
