package Lp2Atividade2;

public class Cliente {
    private int codigo,telefone;
    private String nome,cpf;

    public Cliente(int codigo, String cpf, String nome, int telefone) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public static String buscarCliente(String nome,Cliente[] clientes,int cont){
        for (int i = 0; i < cont; i++) {
            if(clientes[i].getNome().equals(nome)) {
                return ("Cliente encontrado,bem vindo " + nome);
            }
        }
        return ("Cliente nao encontrado...");
    }


    public void exibirDados(){
        System.out.println("=============================exebindo dados do cliente=============================");
        System.out.println("NOME :"+nome);
        System.out.println("CPF :"+cpf);
        System.out.println("CODIGO :"+codigo);
        System.out.println("TELEFONE :"+telefone);
    }
}
