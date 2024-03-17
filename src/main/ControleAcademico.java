package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//a. Quais disciplinas um professor está ministrando;
//b. Qual o horário de um professor;
//c. Quais os alunos de uma dada disciplina;
//d. Quais as disciplinas de um aluno;
//e. Qual o horário de um aluno;
//f. Qual o número de alunos de uma disciplina.
public class ControleAcademico {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();

        //CRIAÇÃO DOS OBJETOS
        Aluno aluno1 = new Aluno("Madu","3456");
        Aluno aluno2 = new Aluno("Nikolas","8790");
        Aluno aluno3 = new Aluno("Elias","8769");
        Aluno aluno4 = new Aluno("Marta","1234");
        Aluno aluno5 = new Aluno("Victor","4290");

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);

        Professor professor1 = new Professor("Boris","5555");
        Professor professor2 = new Professor("Ana","3333");
        Professor professor3 = new Professor("Priscila","2121");

        professores.add(professor1);
        professores.add(professor2);
        professores.add(professor3);

        Disciplina disc1 = new Disciplina("Métodos avançados de programação");
        Disciplina disc2 = new Disciplina("Lógica para programação");
        Disciplina disc3 = new Disciplina("Cálculo III");

        Turma turma1 = new Turma("Turma de MAP");
        Turma turma2 = new Turma("Turma de Lógica para programação");
        Turma turma3 = new Turma("Turma de Cálculo III");

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma2.adicionarAluno(aluno4);
        turma2.adicionarAluno(aluno5);
        turma3.adicionarAluno(aluno2);

        Professor prof1 = professores.get(0);
        Professor prof2 = professores.get(1);
        Professor prof3 = professores.get(2);

        ProfTurma profTurma1 = new ProfTurma(prof1,turma1);
        ProfTurma profTurma2 = new ProfTurma(prof2,turma2);
        ProfTurma profTurma3 = new ProfTurma(prof3,turma3);

        prof1.adicionarTurma(turma1);
        prof2.adicionarTurma(turma2);
        prof3.adicionarTurma(turma3);

        System.out.println("ALUNOS");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }

        System.out.println("\nPROFESSORES");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() + " - Matrícula: " + professor.getMatricula());
        }

        System.out.println("\nDISCIPLINAS");
        System.out.println("Nome da disciplina 1: " + disc1.getNome());
        System.out.println("Nome da disciplina 2: " + disc2.getNome());
        System.out.println("Nome da disciplina 3: " + disc3.getNome());

        System.out.println("\nTURMAS");
        System.out.println("Nome da turma 1: " + turma1.getNome());
        System.out.println("Nome da turma 2: " + turma2.getNome());
        System.out.println("Nome da turma 3: " + turma3.getNome());

        prof1.printTurmasMinistradas();
        prof2.printTurmasMinistradas();
        prof3.printTurmasMinistradas();

        disc1.printQuantidadeAlunos();
        disc2.printQuantidadeAlunos();
        disc3.printQuantidadeAlunos();
    }
}