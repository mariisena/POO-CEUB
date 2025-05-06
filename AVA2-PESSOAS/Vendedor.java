import java.util.Date;

public class Vendedor extends Empregado {
    private double comissao;
    private double metaMensal;
    private double totalVendas;

    public Vendedor(String nome, String cpfOuCnpj, String email, String telefone, String endereco, int matricula, double salario, String cargo, Date dataDeAdmissao, double comissao, double metaMensal) {
        super(nome, cpfOuCnpj, email, telefone, endereco, matricula, salario, cargo, dataDeAdmissao);
        this.comissao = comissao;
        this.metaMensal = metaMensal;
        this.totalVendas = 0.0;
    }

    public double getComissao() {
        return comissao;
    }
    
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(double metaMensal) {
        this.metaMensal = metaMensal;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void venderProduto(double valorVenda) {
        this.totalVendas += valorVenda;
        System.out.println("Venda realizada com sucesso! Valor da venda: " + valorVenda);
    }

    public double calcularComissao() {
        return (totalVendas * comissao) / 100;
    }

    public void vendedorExibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF ou CNPJ: " + getCpfOuCnpj());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Salário: " + getSalario());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Data de Admissão: " + getDataDeAdmissao());
        System.out.println("Comissão: " + comissao);
        System.out.println("Meta Mensal: " + metaMensal);
        System.out.println("Total de Vendas: " + totalVendas);
    }
}
