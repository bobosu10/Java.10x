package desafio.Desafio5;

public interface Conta {
    void consultarSaldo();
    void depositar(double valor);
    void transferencia(Conta destino);
    void transferencia(Conta destino,double valor);
}
