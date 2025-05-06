import java.util.Date;

public class Cliente extends Pessoa {
    private Date dataDeCadastro;

    public Cliente(String nome, String cpfOuCnpj, String email, String telefone, String endereco, Date datadeCadastro) {
        super(nome, cpfOuCnpj, email, telefone, endereco);
        this.dataDeCadastro = datadeCadastro;
    }
    
    public Date getDatadeCadastro() {
        return dataDeCadastro;
    }

    public void setDatadeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public void clienteExibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF ou CNPJ: " + getCpfOuCnpj());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Data de Cadastro: " + dataDeCadastro);
    }
}