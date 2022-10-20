package terceira.aula.petshop;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Agendamento {
    public static void main(String[] args) {
        Animal vaca = new Animal(
                "mamifero",
                "Mimosa",
                "Maria",
                LocalDate.now(),
                LocalTime.now()
        );

        vaca.dados();

        Animal macaco = new Animal(
                "primata",
                "George",
                "Adriana",
                LocalDate.now(),
                LocalTime.now()
        );

        macaco.dados();

    }

}
