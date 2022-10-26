package sexta.aula.exercicio4;

public class Ave extends Animal{

    private boolean voa;

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public Ave(String nome, String cor, String ambiente, Double velocidadeMedia, boolean voa) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.voa = voa;
    }
}
