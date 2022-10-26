package setima.aula;

public class Moto extends Veiculo{
    //atributos
    private String modeloGuidao;

    //construtores
    public Moto(String cor, String placa, String marca, String modeloGuidao) {
        super(cor, placa, marca, TipoVeiculo.MOTO);
        this.modeloGuidao = modeloGuidao;
    }
    public Moto(){

    }

    public String getModeloGuidao() {
        return modeloGuidao;
    }

    public void setModeloGuidao(String modeloGuidao) {
        this.modeloGuidao = modeloGuidao;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "modeloGuidao='" + modeloGuidao + '\'' +
                '}';
    }

    public void ligar() {
        System.out.println("Ligando a moto");
    }
}
