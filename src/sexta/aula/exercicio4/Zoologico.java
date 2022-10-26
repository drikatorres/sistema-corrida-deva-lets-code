package sexta.aula.exercicio4;

public class Zoologico {
    public static void main(String[] args) {
        Ave pinguim = new Ave("Patolino", "Branco e Preto", "Gelo", 7.00, false);

        System.out.println("O pinguim voa??" + pinguim.isVoa());
        pinguim.comer();

        Mamifero camelo = new Mamifero("Mickey", "Caramelo", "Deserto", 65.00, 4);
        camelo.amamentar();

    }
}
