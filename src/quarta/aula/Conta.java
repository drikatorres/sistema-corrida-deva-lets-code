package quarta.aula;

public class Conta {
    private String titular;
    private String numeroConta;
    private String cpf;
    private Double saldo;
    private String codigoBanco;
    private String senha;

    @Override
    //irá sobrescrever o espaço da memória com as informações
    public String toString() {
        return " Conta: \n" +
                " Titular:" + titular +
                "\n Numero conta:" + numeroConta +
                "\n CPF: " + cpf +
                "\n Saldo: " + saldo + "\n";
    }

    //construtor: acesso, classe, argumentos (atribuições)
    public Conta(String titular, String numeroConta, String cpf, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    //Sobrecarga: programa irá utilizar conforme os parametros inseridos
    public Conta(String cpf, String titular) {
        this.cpf = cpf;
        this.titular = titular;
    }

    //construtor vazio(default) - obrigatório quando colocar outros construtores
    public Conta () {

    }

    public String getTitular() {
        return titular;
    }

    //set serve para alterar futuramente
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta () {
        return numeroConta;
    }


    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Não foi possível realizar a operação, " +
                    "pois o saldo não pode ser negativo.");
        }
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
