package terceira.aula;

public class Principal {
    public static void main(String[] args) {
        Funcionario coordenador = new Funcionario(
                5000.00,
                500.0,
                300.0,
                "Samuel",
                "000.000.250-35"
        );

        Funcionario ceo = new Funcionario(80000.0, 2000.0, "500.000.000-00");
        ceo.nome = "Adriana";
        ceo.bonus = Double.valueOf(100);
        Double pagamentoCeo = ceo.calcularPagamento();
        System.out.println(pagamentoCeo);
    }
}
