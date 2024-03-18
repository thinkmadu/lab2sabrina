import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {
  private String nome;
  private String matricula;
  private List<AlunoTurma> turmas = new ArrayList<>();
  private Map<String, String> horarios = new HashMap<>();

  // construtor
  public Aluno(String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  // gets e sets
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public List<AlunoTurma> getTurmas() {
    return turmas;
  }

  public void setTurmas(List<AlunoTurma> turmas) {
    this.turmas = turmas;
  }

  public String getHorario(String disciplina) {
    return horarios.get(disciplina);
  }

  // métodos
  public void adicionarHorario(String disciplina, String horario) {
    try {
      if (disciplina == null || horario == null) {
        throw new NullPointerException("Argumentos nulos não são permitidos.");
      }
      if (!horario.matches("[0-9]{2}:[0-9]{2}")) {
        throw new IllegalArgumentException("Horário inválido. Utilize o formato HH:MM.");
      }
      horarios.put(disciplina, horario);
    } catch (NullPointerException | IllegalArgumentException e) {
      System.err.println("Erro ao adicionar horário: " + e.getMessage());
    }
  }

  public List<Disciplina> disciplinasMatriculadas() {
    try {
        if (turmas == null) {
            throw new NullPointerException("Turmas não inicializadas.");
        }
        if (turmas.isEmpty()) {
            throw new IndexOutOfBoundsException("Nenhuma turma cadastrada.");
        }
        List<Disciplina> disciplinas = new ArrayList<>();
        for (AlunoTurma alunoTurma : turmas) {
            if (alunoTurma != null && alunoTurma.getTurma() != null) {
                disciplinas.add(alunoTurma.getTurma().getDisciplina());
            } else {
                throw new NullPointerException("AlunoTurma ou Turma não inicializados.");
            }
        }
        return disciplinas;
    } catch (NullPointerException | IndexOutOfBoundsException e) {
        System.err.println("Erro ao recuperar disciplinas matriculadas: " + e.getMessage());
        return Collections.emptyList();
    }
}

}
