package oitava.aula;

public class Main {
    public static void main(String[] args) {
        //Pessoa física é um contribuinte
        //Pode usar o contribuinte quanto a algo mais genérico - quando for usar no retorno
        Contribuinte pessoaFisica = new PessoaFisica("Nath", 200000.00, TipoPessoa.PF, "000.000.000-00");
        pessoaFisica.calcularImposto();

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Ada", 5000000.00, TipoPessoa.PJ, "00.000.000/0001-00");
        pessoaJuridica.calcularImposto();

        Contribuinte contribuinteGenerico = new Contribuinte("Maria", 5000.00, TipoPessoa.PF);
        contribuinteGenerico.calcularImposto();
    }

    //usando o contribuinte porque pode ser tanto PF quanto PJ
    public void alterarRenda(Double aumento, Contribuinte contribuinte) {
        Double aumentoRenda = contribuinte.getRenda()*1.10;
        // o que seja alterar entre os parênteses
        contribuinte.setRenda(aumentoRenda);
        System.out.println("A nova renda do contribunte é R$" + contribuinte.getRenda());
    }
}
