package main;
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
        ProfTurma profTurma = new ProfTurma(this, turma);
        this.turmas.add(profTurma);
    }

    public void adicionarHorario(String disciplina, String horario) {
        horarios.put(disciplina, horario);
    }


    public void printTurmasMinistradas() {
        System.out.println("\nTurmas ministradas pelo professor " + this.getNome() + ":");
        for (ProfTurma profTurma : turmas) {
            System.out.println(profTurma.getTurma().getNome());
        }
    }
}
