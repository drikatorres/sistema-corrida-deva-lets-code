package quinta.aula.heranca;

import java.math.BigDecimal;

public class Subgerente extends Gerente{
    public Subgerente(String nome, int matricula, BigDecimal salario, Empregado[] subordinados) {
        super(nome, matricula, salario, subordinados);
    }

    public Subgerente() {
    }
}
