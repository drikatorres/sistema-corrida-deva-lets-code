package quinta.aula.heranca;

import java.math.BigDecimal;

public class Empregado {
    //atributos
    protected String nome;
    protected int matricula;
    protected BigDecimal salario;

    //construtores
    //com parametros
    public Empregado(String nome, int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    //vazio
    public Empregado() {

    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatriula() {
        return matricula;
    }

    public void setMatriula(int matriula) {
        this.matricula = matriula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    //métodos - comportamentos
    public void trabalhar() {
        System.out.println("O " + getNome() + " está trabalhando.");
    }

    public void baterPonto() {
        System.out.println("O " + getNome() + " bateu o ponto.");
    }
}
