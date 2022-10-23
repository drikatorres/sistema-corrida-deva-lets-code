package quinta.aula;

public class ExemploEncapsulamentoCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "azul", "AAAA22AAA", "Nissan");
        pintarCarro("vermelho", carro);
        atualizarPlacaParaMercosul(carro);
    }

    public static void pintarCarro (String cor, Carro carro) {
        if (!cor.equals(carro.getCor())) {
            carro.setCor(cor);
            System.out.println("A cor do carro foi pintada para " + carro.getCor());
        } else {
            System.out.println("A cor do carro já é " + carro.getCor());
        }
    }
    public static void atualizarPlacaParaMercosul (Carro carro){
        StringBuilder placaDoCarro = new StringBuilder(carro.getPlaca());

        if (Character.isDigit(placaDoCarro.charAt(4))) {
            placaDoCarro.setCharAt(4, 'A');
            carro.setPlaca(placaDoCarro.toString());
            System.out.println("A placa do carro foi atualizada para " + carro.getPlaca());
        } else {
            System.out.println("A placa já é do Mercosul");
        }
//        char quintaLetraPlaca = carro.getPlaca().charAt(4);
//        if (Character.isDigit(quintaLetraPlaca)) { //é um digito?
//            carro.getPlaca().replace((char) 4, 'A');
//            System.out.println("A placa foi atualizada");
//        } else {
//            System.out.println("A placa já é do Mercosul");
//        }
    }
}
