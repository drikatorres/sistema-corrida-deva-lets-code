package oitava.aula;

public class Contribuinte {
    private String nome;
    private Double renda;
    private TipoPessoa tipoPessoa;

    public Contribuinte(String nome, Double renda, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.renda = renda;
        this.tipoPessoa = tipoPessoa;
    }

    public Contribuinte() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", renda=" + renda +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }

    public double calcularImposto() {
        double imposto = this.renda*0.2;
        System.out.println("O contribuinte " + this.nome + " irá pagar: " + imposto);
        return imposto;
    }
}
