package setima.aula.reino_animal;

import java.time.LocalTime;

public class Cachorro extends Mamifero{
    private String corFucinhho;
    private String dono;

    public Cachorro(String cor, String nome, String ambiente, Double velocidadeMedia, int quantidadePatas, String corFucinhho, String dono) {
        super(cor, nome, ambiente, velocidadeMedia, quantidadePatas);
        this.corFucinhho = corFucinhho;
        this.dono = dono;
    }

    public void reagir(String dono){
        if (dono == this.dono) {
            System.out.println("Cachorro está abanando o rabo");
        } else {
            System.out.println("O cachorro está latindo");
        }
    }

    public void reagir(LocalTime hora){
        LocalTime horaTrabalho = LocalTime.of(18,0,0);
        if (hora.isAfter(horaTrabalho)) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Abanar o rabo");
        }
    }

    //polimorfismo de sobrecarga com a função de cima - mesma ação feita de uma forma diferente (depende das variaveis que serão passadas
    public void reagir(LocalTime hora, String dono) {
        System.out.println("Abanar o rabo");
    }

    public static void comer(){
        System.out.println("O cachorro está comendo");
    }

    public String getCorFucinhho() {
        return corFucinhho;
    }

    public void setCorFucinhho(String corFucinhho) {
        this.corFucinhho = corFucinhho;
    }
}
