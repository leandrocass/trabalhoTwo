package trabalho;

public class ContaCorrente {
    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private String dataNascimento;
    private String saldo;


    public String getnumeroConta() {
        return numeroConta;
    }

    public void setnumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getnumeroAgencia() {
        return numeroAgencia;
    }

    public void setnumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getnomeCliente() {
        return nomeCliente;
    }

    public void setnomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getsaldo() {
        return saldo;
    }

    public void setsaldo(String saldo) {
        this.saldo = saldo;
    }
}

