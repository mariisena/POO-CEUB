public class Usuario extends Pessoa {
    private String login;
    private String senha;
    private String nivelDeAcesso;

    public Usuario(String nome, String cpfOuCnpj, String email, String telefone, String endereco, String login, String senha, String nivelDeAcesso) {
        super(nome, cpfOuCnpj, email, telefone, endereco);
        this.login = login;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }
    
    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public boolean fazerLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public void usuarioExibirDados() {
        System.out.println("Login: " + login);
        System.out.println("Nível de Acesso: " + nivelDeAcesso);
    }
}
