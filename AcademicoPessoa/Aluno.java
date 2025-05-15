
import java.time.LocalDate;

public class Aluno extends Pessoa {

    private int matricula;
    private boolean ativo;
    private float bolsaDesconto;

    public Aluno(String cpfPessoa, String nomePessoa, String logradouroEndereco, String nroEndereco, String bairroEndereco, String cidadeEndereco, UfBrasil ufEndereco, String cepEndereco, LocalDate dataDeNascimento, int matricula, boolean ativo, float bolsaDesconto) {
        super(cpfPessoa, nomePessoa, logradouroEndereco, nroEndereco, bairroEndereco, cidadeEndereco, ufEndereco, cepEndereco, dataDeNascimento);
        this.matricula = matricula;
        this.ativo = ativo;
        this.bolsaDesconto = bolsaDesconto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public float getBolsaDesconto() {
        return bolsaDesconto;
    }

    public void setBolsaDesconto(float bolsaDesconto) {
        this.bolsaDesconto = bolsaDesconto;
    }

    public void ativar() {
        setAtivo(true);
        System.out.println("\nAluno ativado com sucesso:");
        exibirAluno();
    }

    public void manterAluno(int matricula, boolean ativo, float bolsaDesconto) {
        setMatricula(matricula);
        setAtivo(ativo);
        setBolsaDesconto(bolsaDesconto);
        System.out.println("\nAluno atualizado com sucesso:");
        exibirAluno();
    }

    public void exibirAluno() {
        super.exibirPessoa();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Ativo: " + (ativo ? "Sim" : "Não"));
        System.out.println("Bolsa de Desconto: " + bolsaDesconto + "%");
    }
}
