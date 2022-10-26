package setima.aula.reino_animal;

public class Mamifero extends Animal {
    private int quantidadePatas;

    public Mamifero(String cor, String nome, String ambiente, Double velocidadeMedia, int quantidadePatas) {
        super(cor, nome, ambiente, velocidadeMedia);
        this.quantidadePatas = quantidadePatas;
    }

    public void amamenta(){
        System.out.println("O animal está amamentando");
    }

    public Mamifero(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "quantidadePatas=" + quantidadePatas +
                '}';
    }

    public static void comer(){
        System.out.println("O mamifero está comendo");
    }
}
