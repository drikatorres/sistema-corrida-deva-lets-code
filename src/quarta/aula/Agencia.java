package quarta.aula;

public class Agencia {
    public static void main(String[] args) {
        Conta contaMaria = new Conta("Maria", "555-55", "123.456.789-89", 50.00);
        sacar(10.00, contaMaria);
        System.out.println(contaMaria);
        Conta contaExemplo = new Conta("555.555", "XPTO");
        Conta contaJoao = new Conta("João", "256-33", "159.753.654-56", 300.00);
        System.out.println(contaJoao);
        transferir(60.00, contaJoao, contaMaria);
//        System.out.println(contaMaria);
//        System.out.println(contaJoao);
        pagar(50.00, contaMaria);

    }

    //Métodos
    public static void depositar (Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);
    }
    public static void sacar(Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);

//        antigo modo de fazer:
//        if (conta.saldo < valor) {
//            System.out.println("Saldo insuficiente, " + conta.titular);
//        } else {
//            conta.saldo -=valor;
//        }
    }

    public static void transferir(Double valor, Conta contaOrigem, Conta contaDestino) {
        Double novoSaldoContaOrigem = contaOrigem.getSaldo() - valor;
        contaOrigem.setSaldo(novoSaldoContaOrigem);
        Double novoSaldoContaDestino = contaDestino.getSaldo() + valor;
        contaDestino.setSaldo(novoSaldoContaDestino);
//        if (contaOrigem.saldo > valor) {
//            contaOrigem.saldo -=valor;
//            contaDestino.saldo +=valor;
//        } else {
//            System.out.println("Saldo insuficiente, " + contaOrigem.titular);
//        }

    }

    public static void pagar (Double valor, Conta conta) {
        Double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
//        if (conta.saldo < valor) {
//            System.out.println("Saldo insuficiente, " + conta.titular);
//        } else {
//            conta.saldo -=valor;
//        }
    }
}
