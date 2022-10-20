package primeira.aula;

public class Funcionario {
    int salario;
    int bonus;
    int desconto;

    public int calcularPagamento(){
        return salario + bonus - desconto;
    }
}
