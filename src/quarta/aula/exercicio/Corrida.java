package quarta.aula.exercicio;

import static quarta.aula.exercicio.Sexo.*;

public class Corrida {
    public static void main(String[] args) {
        Piloto pilotoA = new Piloto("Harriet", 24, FEMININO, "Azul");
        CarroCorrida carro1 = new CarroCorrida(333, pilotoA, 250, 50, true);
        System.out.println(carro1.toString());

        acelerar(100, carro1);
        System.out.println("A velocidade atual do carro é " + carro1.getVelocidadeAtual());
        frear(50, carro1);
        System.out.println("A velocidade atual do carro é " + carro1.getVelocidadeAtual());
        frear(100, carro1);
        System.out.println("A velocidade atual do carro é " + carro1.getVelocidadeAtual());
        parar(carro1);
        System.out.println("O carro está parado? " + carro1.isParar());
        desligar(carro1);
        System.out.println("O carro está ligado? " + carro1.isLigado());

        System.out.println(carro1.toString());

    }

  public static boolean ligar(CarroCorrida carro) {

        return carro.setLigado(true);
  }

  public static float acelerar (float aceleracao, CarroCorrida carro) {
        if ((carro.getVelocidadeAtual() + aceleracao <= carro.getVelocidadeMaxima()) && carro.isLigado() == true) {
            return carro.setVelocidadeAtual(carro.getVelocidadeAtual() + aceleracao);
}
        return carro.getVelocidadeAtual();
  }

  public static float frear (float frenagem, CarroCorrida carro) {
        if ((carro.getVelocidadeAtual() - frenagem >= 0) && carro.isLigado() == true) {
            return carro.setVelocidadeAtual(carro.getVelocidadeAtual() - frenagem);
    }
        return carro.getVelocidadeAtual();
  }

  public static boolean parar (CarroCorrida carro) {
        if (carro.getVelocidadeAtual() == 0 && carro.isLigado() == true) {
            return carro.setParar(true);
        }
        return carro.setParar(false);
  }

  public static boolean desligar(CarroCorrida carro) {
        if (carro.isParar() == true) {
            return carro.setLigado(false);
        }
        return carro.setLigado(true);
  }
}

