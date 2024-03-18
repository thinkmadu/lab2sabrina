package main;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private Disciplina disciplina;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;

    //construtor
    // public Turma(String nome){
    //     this.nome = nome;
    //     this.alunos = new ArrayList<>();
    // }

    public Turma(String nome, Professor professor, String horario, Disciplina disciplina) {
        this.nome = nome;
        this.professor = professor;
        this.horario = horario;
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
        professor.getHorarios().getListaTurmas().add(this);
    }
    // tem 2 formas de adicionar o prof na turma no construtor e em profTurma
    public Turma(String nome, String horario, Disciplina disciplina) {
        this.nome = nome; 
        this.horario = horario;
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
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
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }    

    //métodos
    public void adicionarAluno(Aluno aluno) {
        if (aluno.getNome() == null || aluno.getMatricula() == null) {
            throw new NullPointerException("Nome e matrícula não podem ser nulos.");
        }
        
            if (Turma.this.alunos.contains(aluno) ){
                throw new IllegalArgumentException("Aluno já cadastrado.");
            }
        
        alunos.add(aluno);
        aluno.getAlunoTurma().addTurma(this);
      }

    //   public void adicionarTurma(Turma turma) {
    //     if (turma == null) {
    //       throw new NullPointerException("Turma não pode ser nula.");
    //     }

    //     else if (turma.getProfessor() != null) {
    //       throw new IllegalArgumentException("Turma já possui professor.");
    //     }
    //     turma.setProfessor(professor);
    //     this.listaTurmas.add(turma);
    //   }
}