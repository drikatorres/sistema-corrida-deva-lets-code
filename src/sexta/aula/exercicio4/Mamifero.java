package sexta.aula.exercicio4;

public class Mamifero extends Animal {
    private Integer quantidadeDePatas;

    public Integer getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public void setQuantidadeDePatas(Integer quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public Mamifero(String nome, String cor, String ambiente, Double velocidadeMedia, Integer quantidadeDePatas) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public void amamentar() {
        System.out.println("\n" + getNome() +" está amamentando");
    }
}
