public class Atividade {
    private String titulo;
    private String descricao;
    private String turmaOuAluno;

    public Atividade(String titulo, String descricao, String turmaOuAluno) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.turmaOuAluno = turmaOuAluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTurmaOuAluno() {
        return turmaOuAluno;
    }
}
