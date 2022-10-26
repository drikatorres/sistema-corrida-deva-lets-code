package oitava.aula;

public class PessoaFisica extends Contribuinte {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, Double renda, TipoPessoa tipoPessoa, String cpf) {
        super(nome, renda, tipoPessoa);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    //polimorfismo de sobreposição
    //Contribuinte é tipo genérico
    public double calcularImposto() {
        //como é a classe filha tem que usar o get
        double imposto = getRenda()*0.15;
        System.out.println("A pessoa física " + getNome() +" irá pagar R$" + imposto);
        return imposto;
    }
}
