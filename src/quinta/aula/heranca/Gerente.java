package quinta.aula.heranca;

import java.math.BigDecimal;

public class Gerente extends Empregado {
    //gerente herda atribuitos e métodos do empregado
    protected int quantidadeDeEmpregados;
    protected Empregado[] subordinados;

    public Gerente(String nome, int matricula, BigDecimal salario, Empregado[] subordinados) {
        super(nome, matricula, salario); //referencia ao pai
        this.subordinados = new Empregado[10]; //array com 10 posições
    }

    public Gerente() {
    }

    public int getQuantidadeDeEmpregados() {
        return quantidadeDeEmpregados;
    }

    public void setQuantidadeDeEmpregados(int quantidadeDeEmpregados) {
        this.quantidadeDeEmpregados = quantidadeDeEmpregados;
    }

    public Empregado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empregado[] subordinados) {
        this.subordinados = subordinados;
    }

    public void contratar(Empregado novoEmpregado) {
        this.subordinados[quantidadeDeEmpregados] = novoEmpregado;
        this.quantidadeDeEmpregados++; //soma a quantidade de empregados para colocar no índice
    }
}
