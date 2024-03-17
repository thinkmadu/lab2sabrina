import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Professor {
    private String nome;
    private String matricula;
    private List<ProfTurma> turmas;
    private Map<String, String> horarios = new HashMap<>();

    //construtor
    public Professor(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.turmas = new ArrayList<>();
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProfTurma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<ProfTurma> turmas) {
        this.turmas = turmas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHorario(String disciplina) {
        return horarios.get(disciplina);
    }

    //métodos
    public void adicionarTurma(Turma turma) {
        if (turma == null) {
          throw new NullPointerException("Turma não pode ser nula.");
        }
        ProfTurma profTurma = new ProfTurma(this, turma);
        this.turmas.add(profTurma);
      }

      public void adicionarHorario(String disciplina, String horario) {
        if (disciplina == null || horario == null) {
          throw new NullPointerException("Argumentos nulos não são permitidos.");
        }
        if (!horario.matches("[0-9]{2}:[0-9]{2}")) {
          throw new IllegalArgumentException("Horário inválido. Utilize o formato HH:MM.");
        }
        horarios.put(disciplina, horario);
      }


    public void printTurmasMinistradas() {
        if (turmas == null) {
          throw new NullPointerException("Turmas não inicializadas.");
        }
        if (turmas.isEmpty()) {
          throw new IndexOutOfBoundsException("Nenhuma turma cadastrada.");
        }
        System.out.println("\nTurmas ministradas pelo professor " + this.getNome() + ":");
        for (ProfTurma profTurma : turmas) {
          System.out.println(profTurma.getTurma().getNome());
        }
      }
}
