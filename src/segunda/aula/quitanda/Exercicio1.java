package segunda.aula.quitanda;

public class Exercicio1 {
    public static void main(String[] args) {
        Fruta banana = new Fruta();
        banana.quantidade = 10;
        banana.preco = 4.55;
        banana.nome = "banana";
        banana.cor = Cor.AMARELO;
        System.out.println("O valor do estoque é R$" + banana.valorTotal());
        banana.imprimir();

        Fruta maca = new Fruta();
        maca.nome = "Maçã";
        maca.quantidade = 20;
        maca.preco = 1.99;
        maca.cor = Cor.VERMELHO;
        System.out.println(maca.valorTotal());

        Verdura alface = new Verdura();
        alface.nome = "Alface";
        alface.preco = 2.99;
        alface.cor = Cor.VERDE;
        alface.quantidade = 6;
        alface.imprimir();

        Verdura couve = new Verdura();
        couve.nome = "Couve";
        couve.quantidade = 20;
        couve.preco = 15;
        couve.cor = Cor.VERDE;
        couve.imprimir();


        Funcionario a = new Funcionario();
        a.nome = "Maria";
        a.cargo = "Gerente";
        a.setor = "Vendas";
        a.cpf = "000.000.000-00";
        a.matricula = "222-55";
        a.salario = 3500;
        a.cadastro();

        Funcionario b = new Funcionario();
        b.nome = "XPTO";
        a.cargo = "Atendente";
        a.setor = "Atendimento ao cliente";
        b.cpf = "000.000.000-00";
        b.matricula = "777-88";
        a.salario = 3000;
        b.cadastro();

    }
}
