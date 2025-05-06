import java.util.Date;

public class Empregado extends Pessoa {
    private int matricula;
    private double salario;
    private String cargo;
    private Date dataDeAdmissao;

    public Empregado(String nome, String cpfOuCnpj, String email, String telefone, String endereco, int matricula, double salario, String cargo, Date dataDeAdmissao) {
        super(nome, cpfOuCnpj, email, telefone, endereco);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(Date dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public double calcularSalario() {
        return salario; // Retorna o salário atual
    }

    public void empregadoExibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF ou CNPJ: " + getCpfOuCnpj());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de Admissão: " + dataDeAdmissao);
    }
}
