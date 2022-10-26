package oitava.aula;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String nome, Double renda, TipoPessoa tipoPessoa, String cnpj) {
        super(nome, renda, tipoPessoa);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }


}
