package LP2.Lista2_ex001;

public class Circulo {
    private double raio = 1;
    private String cor = "vermelho";


    public Circulo() {
    }

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double CalcularArea(){
        return (2*3.14*(raio*raio));
    }
    public void ExibirDados(){
        System.out.println("===Dados do circulo===");
        System.out.println("Raio : "+raio);
        System.out.println("Cor : "+cor);
        System.out.println("Area : "+CalcularArea());
    }
}
