package setima.aula;

public class Carro extends Veiculo {
    //atributos
    private int numeroPortas;
    public static int quantidadeRodas = 4; //pode ser final também

    //construtor
    public Carro(String cor, String placa, String marca, int numeroPortas) {
        super(cor, placa, marca, setima.aula.TipoVeiculo.CARRO);
        this.numeroPortas = numeroPortas;
    }
    public Carro(){

    }

    //getters e setters (encapsulamento)

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public static int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public static void setQuantidadeRodas(int quantidadeRodas) {
        Carro.quantidadeRodas = quantidadeRodas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                '}';
    }

    //método
    //polimorfismo - sobrescreve o ligar
    public void ligar() {
        System.out.println("Ligando o carro");
    }
}
