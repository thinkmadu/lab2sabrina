package main;
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

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    public List<Turma> getTurmas() {
        return turmas;
    }

    // public void setTurmas(List<Turma> turmas) {
    //     this.turmas = turmas;
    // }

    public void addTurmaNaDisciplina(Turma turma){
        if (turma == null){
            throw new NullPointerException("Turma não pode ser nula");
        }
        else if (turmas.contains(turma)){
            throw new IllegalArgumentException("Turma já cadastrada");
        }
        turmas.add(turma);
    }

    public String qtdAlunos() {
        int totalAlunos = 0;
        for (Turma turma : turmas) {
            totalAlunos += turma.getAlunos().size();
        }
        return ("\nQuantidade de alunos na disciplina " + this.nome + ": " + totalAlunos);
    }

    public String alunos(){
        StringBuilder todosAlunos = new StringBuilder();
        todosAlunos.append("\nAlunos da disciplina " + this.nome + ":\n");
        for (Turma turma : turmas){
            todosAlunos.append("Turma: "+ turma.getNome() + "\n");
            for(Aluno aluno : turma.getAlunos()){
                todosAlunos.append(aluno.getNome() + " "+ aluno.getMatricula()+"\n");
            }
            todosAlunos.append("\n");
        }
        return todosAlunos.toString();
    }
}