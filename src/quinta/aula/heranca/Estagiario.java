package quinta.aula.heranca;

import java.math.BigDecimal;

public class Estagiario extends Empregado{
    public Estagiario(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);
    }

    public Estagiario() {
    }

    public void pegarCafe() {
        System.out.println("O estagiário está pegando o café!");
    }
}
