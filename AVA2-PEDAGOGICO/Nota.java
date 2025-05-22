public class Nota {
    private String nomeAluno;
    private String tituloAtividade;
    private double valor;

    public Nota(String nomeAluno, String tituloAtividade, double valor) {
        this.nomeAluno = nomeAluno;
        this.tituloAtividade = tituloAtividade;
        this.valor = valor;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getTituloAtividade() {
        return tituloAtividade;
    }

    public double getValor() {
        return valor;
    }
}
