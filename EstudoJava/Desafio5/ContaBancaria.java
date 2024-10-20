package desafio.Desafio5;

public abstract class ContaBancaria implements Conta {
    private double saldo;
    private TipoConta tipo;

    public ContaBancaria(double saldo,TipoConta tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public void consultarSaldo(){
        System.out.println("DATEBAYO,essa e sua conta "+tipo);
        System.out.println("Esse e seu saldo ninja atual : "+saldo);
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void transferencia(Conta destino) {
        if (saldo > 0) {
            destino.depositar(saldo);
            System.out.println("YO!todo saldo de " + saldo + " transferido para conta destino!");
            saldo = 0;
        } else {
            System.out.println("Saldo insuficiente para realizar transferencia!");
        }
    }

        @Override
        public void transferencia(Conta destino,double valor){
            if(valor > saldo){
                System.out.println("Saldo insuficiente para transferir");
            }else{
                saldo -= valor;
                destino.depositar(valor);
                System.out.println("Transferencia ninja de "+valor+" realizada com sucesso!Saldo atual "+saldo+"|"+tipo);
            }
        }

    }

