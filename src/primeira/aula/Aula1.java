package primeira.aula;

public class Aula1 {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario();
        gerente.salario = 10000;
        gerente.bonus = 200;
        gerente.desconto = 100;

        double pagamentoFuncionario = gerente.calcularPagamento();
        System.out.printf("O pagamento do gerente é %s\n", pagamentoFuncionario);

        Funcionario estagiario = new Funcionario();
        estagiario.salario = 500;
        estagiario.bonus = 500;
        estagiario.desconto = 10;

        double pagamentoEstagiario = estagiario.calcularPagamento();
        System.out.printf("O pagamento do estagiário é %s", pagamentoEstagiario);

    }
}
