
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String cpfPessoa;
    private String nomePessoa;
    private String logradouroEndereco;
    private String nroEndereco;
    private String bairroEndereco;
    private String cidadeEndereco;
    private UfBrasil ufEndereco;
    private String cepEndereco;
    private LocalDate dataDeNascimento;
    private List<TelefonePessoa> telefones;

    public Pessoa(String cpfPessoa, String nomePessoa, String logradouroEndereco, String nroEndereco, String bairroEndereco, String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco, LocalDate dataDeNascimento) {
        this.cpfPessoa = cpfPessoa;
        this.nomePessoa = nomePessoa;
        this.logradouroEndereco = logradouroEndereco;
        this.nroEndereco = nroEndereco;
        this.bairroEndereco = bairroEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.ufEndereco = ufEndereco;
        this.cepEndereco = cepEndereco;
        this.dataDeNascimento = dataDeNascimento;
        this.telefones = new ArrayList<>();
    }

    public void adicionarTelefone(TelefonePessoa telefone) {
        telefones.add(telefone);
        System.out.println("Telefone adicionado: " + telefone);
    }

    public void removerTelefone(TelefonePessoa telefone) {
        if (telefones.remove(telefone)) {
            System.out.println("Telefone removido: " + telefone);
        } else {
            System.out.println("Telefone não encontrado.");
        }
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getNroEndereco() {
        return nroEndereco;
    }

    public void setNroEndereco(String nroEndereco) {
        this.nroEndereco = nroEndereco;
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        this.bairroEndereco = bairroEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public UfBrasil getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(UfBrasil ufEndereco) {
        this.ufEndereco = ufEndereco;
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<TelefonePessoa> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefonePessoa> telefones) {
        this.telefones = telefones;
    }

    public void manterPessoa(String nomePessoa, String cpfPessoa, String logradouroEndereco, String nroEndereco,
            String bairroEndereco, String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco,
            LocalDate dataDeNascimento) {
        setNomePessoa(nomePessoa);
        setCpfPessoa(cpfPessoa);
        setLogradouroEndereco(logradouroEndereco);
        setNroEndereco(nroEndereco);
        setBairroEndereco(bairroEndereco);
        setCidadeEndereco(cidadeEndereco);
        setUfEndereco(ufEndereco);
        setCepEndereco(cepEndereco);
        setDataDeNascimento(dataDeNascimento);

        System.out.println("\nPessoa atualizada com sucesso:");
        exibirPessoa();
    }

    public void exibirPessoa() {
        System.out.println("\n--- Dados da Pessoa ---");
        System.out.println("Nome: " + nomePessoa);
        System.out.println("CPF: " + cpfPessoa);
        System.out.println("Endereço: " + logradouroEndereco + ", " + nroEndereco + ", " + bairroEndereco + ", " + cidadeEndereco + " - " + ufEndereco);
        System.out.println("CEP: " + cepEndereco);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        System.out.println("Telefones:");
    }
}
