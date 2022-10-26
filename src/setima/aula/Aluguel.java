package setima.aula;

import java.util.Random;

public class Aluguel {
    public static void main(String[] args) {
        Veiculo veiculo = pegarVeiculoAleatorio();
        System.out.println(veiculo);
        veiculo.ligar();

        //usando construtor vazio
        Moto moto = new Moto();
        moto.setPlaca("2255");
        moto.setCor("rosa");
        moto.setMarca("BMW");
        moto.setModeloGuidao("alto");



    }


    //pode devolver moto ou carro, tipo de retorno é Veiculo (moto ou carro)
    public static Veiculo pegarVeiculoAleatorio() {
        //tipo da variável, variável e instancia
        //tipo de variável = carro
        Carro carro1 = new Carro("preto", "AAABBB", "Nissan", 4);
        Carro carro2 = new Carro("azul", "NBYBBB", "Nissan", 3);
        //tipo de variável = moto
        Moto moto1 = new Moto("vermelha", "LLLAAA", "Honda", "modelo top");
        Moto moto2 = new Moto("amarelo", "AAAAAA", "Honda", "modelo muito top");
        //tipo de variável = Veículo (que pode ser moto ou carro)
        Veiculo moto3 = new Moto("lilás", "AAAAAA", "Honda", "modelo top demais");
        Random gerador = new Random();
        int valorAleatorio = gerador.nextInt(5); // valor inteiro que vai até 3 (0-3)
        System.out.println(valorAleatorio);

        switch (valorAleatorio) {
            case 0:
                return moto1;
            case 1:
                return moto2;
            case 2:
                return carro1;
            case 3:
                return carro2;
            default:
                return moto3;
        }
    }
}
