package segunda.aula.quitanda;

public class Funcionario {
    String nome;
    String matricula;
    String cpf;
    String setor;
    String cargo;
    double salario;

   public void cadastro() {
       System.out.printf("A funcionária de nome %s, tem matricula %s, é do setor %s, seu cargo é %s e tem remuneração " +
               "de R$%.2f\n", nome, matricula, setor, cargo, salario);
   }

}
