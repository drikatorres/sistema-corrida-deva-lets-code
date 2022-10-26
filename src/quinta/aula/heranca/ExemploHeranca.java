package quinta.aula.heranca;

import java.math.BigDecimal;

public class ExemploHeranca {
    Gerente gerente = new Gerente();
    Subgerente subgerente = new Subgerente();
    Estagiario estagiario = new Estagiario("Heloisa", 555, BigDecimal.ONE);
}
