package desafio.Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, TipoConta tipo) {
        super(saldo, tipo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("esta e sua conta corrente e este e seu saldo : " + getSaldo());
        } else {
            System.out.println("valor depositado invalido!");
        }
    }
}
