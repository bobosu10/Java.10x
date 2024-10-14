package LP2AtividadedeOrientacaoaObjetos;

public class Retangulo {
    private double largura;
    private double altura;

    public  Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(double altura, double largura){
        double Area = (largura * altura);
        return Area;
    }

    public double calcularPerimetro(double altura, double largura){
        double Perimetro = (2 * (largura + altura));
        return Perimetro;
    }
    public void exiberDados(double altura, double largura, double Area,double Perimetro){
        System.out.println("Altura : "+altura+" | "+"Largura : "+largura+" | "+"Area : "+Area+" | "+"Perimetro : "+Perimetro);
    }
}
