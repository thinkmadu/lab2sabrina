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

       Disciplina disciplina1 = new Disciplina("Física");
       Disciplina disciplina2 = new Disciplina("Português");
       Disciplina disciplina3 = new Disciplina("Filosofia");
       
       Professor professor1 = new Professor("Boris","5555");
       Professor professor2 = new Professor("Clarice","5432");
       Professor professor3 = new Professor("Kevin","7222");

        Turma turma1 = new Turma("Turma de Física", "8:00", disciplina1);
        Turma turma2 = new Turma("Turma de Português",professor2, "10:00", disciplina2);
        Turma turma3 = new Turma("Turma de Filosofia",professor1, "14:00", disciplina3);

        professor1.getHorarios().adicionarTurma(turma1);
       // professor3.getHorarios().adicionarTurma(turma2); //turma2 ja tem prof
        
        Aluno josefa = new Aluno("Josefa", "56456456");
        Aluno joao = new Aluno("João", "12345678");
        Aluno pedro = new Aluno("Pedro", "56789012");
        Aluno juliana = new Aluno("Juliana", "87654321");
        Aluno roberto = new Aluno("Roberto", "76543210");
        Aluno fernanda = new Aluno("Fernanda", "65432109");
        Aluno rafael = new Aluno("Rafael", "54321098");
        Aluno carlos = new Aluno("Carlos", "34567890");
        Aluno ana = new Aluno("Ana", "45678901");
        
        turma1.adicionarAluno(josefa);
        turma1.adicionarAluno(joao);
        turma1.adicionarAluno(pedro);
       // turma1.adicionarAluno(pedro); // aluno repetido
        
        turma2.adicionarAluno(josefa);
        turma2.adicionarAluno(juliana);
        turma2.adicionarAluno(roberto);
        turma2.adicionarAluno(fernanda);
        turma2.adicionarAluno(rafael);
        
        turma3.adicionarAluno(josefa);
        turma3.adicionarAluno(carlos);
        turma3.adicionarAluno(ana);
        
        // é pra josefa ta nas turmas 1 2 e 3
        josefa.getAlunoTurma().printAulas();


        //é pro professor1 estar em 2 turmas
        professor1.getHorarios().printTurmasMinistradas();

        

    
    //     professores.add(professor1);
    //     professores.add(professor2);
    //     professores.add(professor3);



    //     Professor prof1 = professores.get(0);
    //     Professor prof2 = professores.get(1);
    //     Professor prof3 = professores.get(2);

    //     ProfTurma profTurma1 = new ProfTurma(prof1,turma1);
    //     ProfTurma profTurma2 = new ProfTurma(prof2,turma2);
    //     ProfTurma profTurma3 = new ProfTurma(prof3,turma3);

    //     prof1.adicionarTurma(turma1);
    //     prof2.adicionarTurma(turma2);
    //     prof3.adicionarTurma(turma3);

    //     System.out.println("ALUNOS");
    //     for (Aluno aluno : alunos) {
    //         System.out.println("Nome: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
    //     }

    //     System.out.println("\nPROFESSORES");
    //     for (Professor professor : professores) {
    //         System.out.println("Nome: " + professor.getNome() + " - Matrícula: " + professor.getMatricula());
    //     }

    //     System.out.println("\nDISCIPLINAS");
    //     System.out.println("Nome da disciplina 1: " + disc1.getNome());
    //     System.out.println("Nome da disciplina 2: " + disc2.getNome());
    //     System.out.println("Nome da disciplina 3: " + disc3.getNome());

    //     System.out.println("\nTURMAS");
    //     System.out.println("Nome da turma 1: " + turma1.getNome());
    //     System.out.println("Nome da turma 2: " + turma2.getNome());
    //     System.out.println("Nome da turma 3: " + turma3.getNome());

    //     prof1.printTurmasMinistradas();
    //     prof2.printTurmasMinistradas();
    //     prof3.printTurmasMinistradas();

    //     disc1.printQuantidadeAlunos();
    //     disc2.printQuantidadeAlunos();
    //     disc3.printQuantidadeAlunos();
     }
}