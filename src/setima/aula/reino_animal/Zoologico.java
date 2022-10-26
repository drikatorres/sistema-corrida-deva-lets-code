package setima.aula.reino_animal;

import java.time.LocalTime;

public class Zoologico {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo",
                "Pepeu",
                "casa",
                16.0,
                4,
                "castanho",
                "Gabriela");

        cachorro.reagir("Ana");
        cachorro.reagir(LocalTime.of(19,0,0));
        cachorro.reagir(LocalTime.of(19,0,0), "Gabriela");
    }
}
