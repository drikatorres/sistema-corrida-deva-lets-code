package segunda.aula.quitanda;

public class Fruta {
    public String nome;
    public Cor cor;
    public int quantidade;
    public double preco;

    public double valorTotal () {
        double valorTotal = quantidade*preco;
        return valorTotal;
    }

    public void imprimir () {
        System.out.println(
                " Nome: " + nome +
                "\n Cor: " + cor +
                "\n Quantidade: " + quantidade
        );
    }
}
