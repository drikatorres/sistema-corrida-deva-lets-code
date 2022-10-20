package terceira.aula;

public class Funcionario {
    public Double salario;
    public Double desconto;
    public Double bonus;
    public String nome;
    public final String CPF;


//    public Funcionario(
//            Double salarioDoFuncionario,
//            Double descontoDoFuncionario,
//            Double bonusDoFuncionario,
//            String nomeDoFuncionario
//    )   {
//        salario = salarioDoFuncionario;
//        desconto = descontoDoFuncionario;
//        bonus = bonusDoFuncionario;
//        nome = nomeDoFuncionario;
//        }
public Funcionario(
        Double salario,
        Double desconto,
        Double bonus,
        String nome,
        String CPF)   {
    this.salario = salario;
    this.desconto = desconto;
    this.bonus = bonus;
    this.nome = nome;
    this.CPF = CPF;
}


    public Funcionario (
            Double salario,
            Double desconto,
            String CPF) {
        this.salario = salario;
        this.desconto = desconto;
        this.CPF = CPF;
    }


    public Double calcularPagamento () {
        return salario - desconto + bonus;
    }
}
