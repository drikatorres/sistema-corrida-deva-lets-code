package quarta.aula.exercicio;

public class CarroCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;
    private boolean parar;

    @Override
    public String toString() {
        return " Carro: \n" +
                " Numero Carro: " + numeroCarro +
                "\n " + piloto +
                "\n Velocidade Maxima: " + velocidadeMaxima +
                "\n Velocidade Atual: " + velocidadeAtual +
                "\n Ligado: " + ligado +
                "\n Parado: " + parar + "\n";
    }

    public CarroCorrida (Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public CarroCorrida () {
    }

    public int getNumeroCarro () {

        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {

        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {

        return piloto;
    }

    public void setPiloto(Piloto piloto) {

        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {

        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima (float velocidadeMaxima) {
        if (velocidadeAtual <= velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Velocidade não pode exceder velocidade máxima");
        }

    }

    public float getVelocidadeAtual() {

        return velocidadeAtual;
    }

    public float setVelocidadeAtual(float velocidadeAtual) {

        this.velocidadeAtual = velocidadeAtual;
        return velocidadeAtual;
    }

    public boolean isLigado() {

        return ligado;
    }

    public boolean setLigado(boolean ligado) {
        this.ligado = ligado;
        return ligado;
    }

    public boolean isParar() {
        return parar;
    }

    public boolean setParar(boolean parar) {
        this.parar = parar;
        return parar;
    }
}



