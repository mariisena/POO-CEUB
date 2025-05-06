import java.util.Date;

public class Fornecedor extends Pessoa {
    private String razaoSocial;
    private Date dataDeCadastro;
    private String categoria;

    public Fornecedor(String nome, String cpfOuCnpj, String email, String telefone, String endereco, String razaoSocial, Date dataDeCadastro, String categoria) {
        super(nome, cpfOuCnpj, email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.dataDeCadastro = dataDeCadastro;
        this.categoria = categoria;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void fornecedorExibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF ou CNPJ: " + getCpfOuCnpj());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Data de Cadastro: " + dataDeCadastro);
        System.out.println("Categoria: " + categoria);
    }
}
