
import java.time.LocalDate;

class Professor extends Pessoa {

    private String titularidade;
    private NivelEscolar nivelEscolaridade;

    public Professor(String cpfPessoa, String nomePessoa, String logradouroEndereco, String nroEndereco, String bairroEndereco, String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco, LocalDate dataDeNascimento, String titularidade, NivelEscolar nivelEscolaridade) {
        super(cpfPessoa, nomePessoa, logradouroEndereco, nroEndereco, bairroEndereco, cidadeEndereco, ufEndereco, cepEndereco, dataDeNascimento);
        this.titularidade = titularidade;
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }

    public NivelEscolar getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(NivelEscolar nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public void manterProfessor(String titularidade, NivelEscolar nivelEscolar) {
        setTitularidade(titularidade);
        setNivelEscolaridade(nivelEscolaridade);
        System.out.println("\nProfessor atualizado com sucesso:");
        exibirProfessor();
    }

    public void exibirProfessor() {
        super.exibirPessoa();
        System.out.println("Titularidade: " + titularidade);
        System.out.println("Nível de Escolaridade: " + nivelEscolaridade);
    }
}
