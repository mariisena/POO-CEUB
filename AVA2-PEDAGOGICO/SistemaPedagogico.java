import java.util.ArrayList;

public class SistemaPedagogico {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Atividade> atividades = new ArrayList<>();
    private ArrayList<Nota> notas = new ArrayList<>();

    public void cadastrarAluno(String nome, String turma) {
        Aluno aluno = new Aluno(nome, turma);
        alunos.add(aluno);
    }

    public void cadastrarAtividade(String titulo, String descricao, String turmaOuAluno) {
        Atividade atividade = new Atividade(titulo, descricao, turmaOuAluno);
        atividades.add(atividade);
    }

    public void lancarNota(String nomeAluno, String tituloAtividade, double valor) {
        Nota nota = new Nota(nomeAluno, tituloAtividade, valor);
        notas.add(nota);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

}
