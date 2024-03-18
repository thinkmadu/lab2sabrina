import java.util.List;

public class ProfTurma {
    private Professor professor;
    private Turma turma;

    //construtor
    public ProfTurma(Professor professor, Turma turma) {
        this.professor = professor;
        this.turma = turma;
    }

    //gets e sets
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void printTurmasCadastradas(List<ProfTurma> profTurmas) {
  try {
    if (profTurmas == null || profTurmas.isEmpty()) {
      System.out.println("Nenhuma turma cadastrada.");
      return;
    }
    
    System.out.println("Turmas cadastradas:");
    for (ProfTurma profTurma : profTurmas) {
      Professor professor = profTurma.getProfessor();
      if (professor != null) {
        System.out.println("- Professor: " + professor.getNome() + ", Turma: " + profTurma.getTurma().getNome());
      } else {
        System.out.println("- Turma sem professor associado: " + profTurma.getTurma().getNome());
      }
    }
  } catch (NullPointerException e) {
    System.err.println("Erro ao imprimir turmas cadastradas: " + e.getMessage());
  }
}
}
