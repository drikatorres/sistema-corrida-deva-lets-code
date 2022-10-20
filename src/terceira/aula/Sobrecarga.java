package terceira.aula;

public class Sobrecarga {
    public static void main(String[] args) {
        int resultadoSoma2Numeros = somarNumeros(1,15);
        int resultadoSoma3Numeros = somarNumeros(10,15,20);
        cadastrarConta("1234");
        cadastrarConta("Drika Torres", "1234");
    }

    private static int somarNumeros (int valor1, int valor2) {
        return valor1 + valor2;
    }

    private static int somarNumeros (int valor1, int valor2, int valor3) {
        return valor1 + valor2 + valor3;
    }

    public static void cadastrarConta (String pessoa, String conta) {

    }
    public static void cadastrarConta (String conta) {

    }
}
