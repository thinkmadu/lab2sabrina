import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Turma> turmas = new ArrayList<>();

    //construtor
    public Disciplina(String nome){
        this.nome = nome;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public String printQuantidadeAlunos() {
        int totalAlunos = 0;
        try {
          if (turmas == null || turmas.isEmpty()) {
            return "Nenhuma turma cadastrada para esta disciplina.";
          }
          
          for (Turma turma : turmas) {
            if (turma != null && turma.getAlunos() != null) {
              totalAlunos += turma.getAlunos().size();
            } else {
              System.err.println("Erro: Turma nula ou lista de alunos nula para turma " + turma);
            }
          }
        } catch (NullPointerException e) {
          System.err.println("Erro ao calcular quantidade de alunos: " + e.getMessage());
        }
        return ("\nQuantidade de alunos na disciplina " + this.nome + ": " + totalAlunos);
      }
}
