package quarta.aula.exercicio;

public class Piloto {
    private String nome;
    private Integer idade;
    private Enum sexo;
    private String equipe;

    @Override
    public String toString() {
        return " Piloto: " +
                "\n Nome: " + nome +
                "\n Idade: " + idade +
                "\n Sexo: " + sexo +
                "\n Equipe: " + equipe + "\n";
    }

    public Piloto (String nome, Integer idade, Enum sexo, String equipe) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Enum getSexo() {
        return sexo;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
