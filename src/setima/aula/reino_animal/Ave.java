package setima.aula.reino_animal;

public class Ave extends Animal{
    private boolean voa;

    public Ave(String cor, String nome, String ambiente, Double velocidadeMedia, boolean voar) {
        super(cor, nome, ambiente, velocidadeMedia);
        this.voa = voa;
    }

    public Ave() {
    }

    public void voar() {
        if(voa) {
            System.out.println("O animal está voando");
        } else {
            System.out.println("O animal não voa");
        }
    }

    public boolean isVoar() {
        return voa;
    }

    public void setVoar(boolean voa) {
        this.voa = voa;
    }

    public static void comer(){
        System.out.println("A ave está comendo");
    }


}
