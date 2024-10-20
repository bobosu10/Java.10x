package desafio.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo,TipoConta tipo) {
        super(saldo,tipo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + (valor * 0.99));
            System.out.println("esta e sua conta poupanca e este e seu saldo : " + getSaldo());
        }else{
            System.out.println("valor depositado invalido!");
        }
    }
}
