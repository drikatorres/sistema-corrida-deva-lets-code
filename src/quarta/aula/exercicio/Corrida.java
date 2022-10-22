package quarta.aula.exercicio;

import static quarta.aula.exercicio.Sexo.*;

public class Corrida {
    public static void main(String[] args) {
        Piloto pilotoA = new Piloto("Harriet", 24, FEMININO, "Azul");
        CarroCorrida carro1 = new CarroCorrida(333, pilotoA, 250, 50, true);
        System.out.println(carro1.toString());

        float velocidade1 = acelerar(200, carro1);
        System.out.println(velocidade1);
        System.out.println(carro1.getVelocidadeAtual());
        frear(50, carro1);
        System.out.println(carro1.getVelocidadeAtual());
        frear(200, carro1);
        System.out.println(carro1.getVelocidadeAtual());
        parar(carro1);
        System.out.println(carro1.parar);
        desligar(carro1);
        System.out.println(carro1.ligado);

        System.out.println(carro1.toString());

    }

  public  static boolean ligar(CarroCorrida carro) {
      return carro.setLigado(true);
  }

  public static float acelerar (float aceleracao, CarroCorrida carro) {
        if (carro.velocidadeAtual + aceleracao < carro.velocidadeMaxima && carro.ligado == true) {
            return carro.velocidadeAtual += aceleracao;
}
        return carro.velocidadeAtual;
  }

  public static float frear (float frenagem, CarroCorrida carro) {
        if (carro.velocidadeAtual - frenagem >= 0 && carro.ligado == true) {
            return carro.velocidadeAtual -= frenagem;
    }
        return carro.velocidadeAtual;
  }

  public static boolean parar (CarroCorrida carro) {
        if (carro.velocidadeAtual == 0 && carro.ligado == true) {
            return carro.parar = true;
        }
        return carro.parar = false;
  }

  public static boolean desligar(CarroCorrida carro) {
        if (carro.parar == true) {
            return carro.ligado = false;
        }
        return carro.ligado = true;
  }
}

