package quinta.aula;

public class ExemploUsuario {
    public static void main(String[] args) {
        Usuario novoUsuario = criarUsuario();
        //pega a senha que o usuário digitou
        String novaSenhaCriptograda = criptografaSenha(novoUsuario.getSenha());
        //criptografa a senha digitada pelo usuário e "seta" nele
        //set serve para atualizar o valor
        novoUsuario.setSenha(novaSenhaCriptograda);

    }

    public static Usuario criarUsuario() {
        //cria usuário com a senha aberta
        Usuario novoUsuario = new Usuario("Anderson", "1234");
        return novoUsuario;
    }


    public static String criptografaSenha (String senha) {
        return "********";
    }
}
