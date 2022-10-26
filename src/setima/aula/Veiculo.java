package setima.aula;

public class Veiculo {
    //atributos, construtores e getters and setters
    private String cor;
    private String placa;
    private String marca;
    private TipoVeiculo TipoVeiculo;

    public Veiculo(String cor, String placa, String marca, TipoVeiculo TipoVeiculo) {
        this.cor = cor;
        this.placa = placa;
        this.marca = marca;
        this.TipoVeiculo = TipoVeiculo;
    }
    public Veiculo(){

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public setima.aula.TipoVeiculo getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(setima.aula.TipoVeiculo tipoVeiculo) {
        TipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void ligar() {
        System.out.println("Ligando o veículo");
    }
}
