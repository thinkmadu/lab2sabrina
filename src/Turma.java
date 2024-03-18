import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private Disciplina disciplina;
    private List<Aluno> alunos;
    private Professor professor;

    //construtor
    public Turma(String nome){
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
        }

    //métodos
    public void adicionarAluno(Aluno aluno) {
        try {
          if (aluno == null) {
            throw new NullPointerException("Aluno não pode ser nulo.");
          }
          alunos.add(aluno);
        } catch (NullPointerException e) {
          System.err.println("Erro ao adicionar aluno: " + e.getMessage());
        }
      }
}
