public class AlunoTurma {
    private Aluno nome;
    private Turma turma;

    public AlunoTurma(Aluno nome, Turma turma) {
        this.nome = nome;
        this.turma = turma;
    }

    public Aluno getAluno() {
        return nome;
    }

    public Turma getTurma() {
        return turma;
    }
}
