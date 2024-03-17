package main;
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
        horarios.put(disciplina, horario);
    }

    public List<Disciplina> disciplinasMatriculadas() {
        List<Disciplina> disciplinas = new ArrayList<>();
        for (AlunoTurma alunoTurma : turmas) {
            disciplinas.add(alunoTurma.getTurma().getDisciplina());
        }
        return disciplinas;
    }
}
