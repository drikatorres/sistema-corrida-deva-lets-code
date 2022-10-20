package segunda.aula.quitanda;

public class Verdura {
    String nome;
    Cor cor;
    int quantidade;
    double preco;

    public void imprimir () {
        System.out.println(
                " Nome: " + nome +
                        "\n Cor: " + cor +
                        "\n Quantidade: " + quantidade
        );
    }

}
