package main;

import java.util.ArrayList;

public class AlunoTurma {
    private Aluno aluno;
   // private Turma turma;
    private ArrayList<Turma> listaTurmas;

    public AlunoTurma(Aluno aluno) {
        this.aluno = aluno;
        this.listaTurmas = new ArrayList<Turma>();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void addTurma(Turma turma){
        if(turma==null){
            throw new NullPointerException("Turma não pode ser nula");
        }
        else if (listaTurmas.contains(turma)) {
            throw new IllegalArgumentException("Turma já cadastrada");         
        }
        this.listaTurmas.add(turma);
    }

    public void printAulas() {
        if(aluno.getMatricula() == null){
            throw new NullPointerException("Aluno não cadastrado");
        }
        System.out.println("Turmas do aluno " + aluno.getNome() + ":");
        for (Turma turma : listaTurmas) {
            System.out.println(turma.getNome() + ": " + turma.getDisciplina().getNome() + ", " + turma.getHorario());
        }
    }

}
