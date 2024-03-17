package main;
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

    public void printTurmasMinistradas() {
        System.out.println("Turmas ministradas pelo professor " + professor.getNome() + ":");
        System.out.println(turma.getNome());
    }
}
