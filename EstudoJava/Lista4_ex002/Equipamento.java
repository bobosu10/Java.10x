package LP2.Lista4_ex002;

public class Equipamento {
    private boolean ligado;
    private String nome;

    public Equipamento(boolean ligado, String nome) {
        this.ligado = ligado;
        this.nome = nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String ligar(){
        ligado = true;
        return "Equipamento "+nome+" ligado";
    }
    public String desligar(){
        ligado = false;
        return "Equipamento "+nome+" desligado";
    }
}
