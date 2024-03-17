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
        for (Turma turma : turmas) {
            totalAlunos += turma.getAlunos().size();
        }
        return ("\nQuantidade de alunos na disciplina " + this.nome + ": " + totalAlunos);
    }
}
