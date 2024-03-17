import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {
    private String nome;
    private String matricula;
    private List<AlunoTurma> turmas = new ArrayList<>();
    private Map<String, String> horarios = new HashMap<>();

    //construtor
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void getNome(String nome) {
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

    //métodos
    public void adicionarHorario(String disciplina, String horario) {
        if (disciplina == null || horario == null) {
          throw new NullPointerException("Argumentos nulos não são permitidos.");
        }
        if (!horario.matches("[0-9]{2}:[0-9]{2}")) {
          throw new IllegalArgumentException("Horário inválido. Utilize o formato HH:MM.");
        }
        horarios.put(disciplina, horario);
      }

    public List<Disciplina> disciplinasMatriculadas() {
        if (turmas == null) {
          throw new NullPointerException("Turmas não inicializadas.");
        }
        if (turmas.isEmpty()) {
          throw new IndexOutOfBoundsException("Nenhuma turma cadastrada.");
        }
        List<Disciplina> disciplinas = new ArrayList<>();
        for (AlunoTurma alunoTurma : turmas) {
          disciplinas.add(alunoTurma.getTurma().getDisciplina());
        }
        return disciplinas;
      }
}
