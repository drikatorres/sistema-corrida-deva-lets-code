package terceira.aula.petshop;

import java.time.LocalDate;
import java.time.LocalTime;

public class Animal {
    public String especie;
    public String nome;
    public String nomeDoDono;
    public LocalDate data;
    public LocalTime hora;

    @Override
    public String toString() {
        return "Animal" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                ", nomeDoDono='" + nomeDoDono + '\'' +
                ", data=" + data +
                ", hora=" + hora +
                ' ';
    }

    public Animal (
            String especie,
            String nome,
            String nomeDoDono,
            LocalDate data,
            LocalTime hora
    ) {
        this.especie = especie;
        this.nome = nome;
        this.nomeDoDono = nomeDoDono;
        this.data = data;
        this.hora = hora;

    }

    public void dados () {
        System.out.printf("O animal de espécie %s, nome %s, com o(a) tutor(a) %s está agendado para o dia", especie, nome, nomeDoDono + " " + data + " " + hora);
        System.out.println(" ");
    }
}
