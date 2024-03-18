package main;

//a. Quais disciplinas um professor está ministrando;
//b. Qual o horário de um professor;
//c. Quais os alunos de uma dada disciplina;
//d. Quais as disciplinas de um aluno;
//e. Qual o horário de um aluno;
//f. Qual o número de alunos de uma disciplina.
public class ControleAcademico {
    public static void main(String[] args) {

       Disciplina disciplina1 = new Disciplina("Física");
       Disciplina disciplina2 = new Disciplina("Português");
       Disciplina disciplina3 = new Disciplina("Filosofia");
       
       Professor professor1 = new Professor("Boris","5555");
       Professor professor2 = new Professor("Clarice","5432");
       Professor professor3 = new Professor("Kevin","7222");

        Turma turma1 = new Turma("Turma 1 de Física", "8:00", disciplina1);
        Turma turma2 = new Turma("Turma 1 de Português",professor2, "10:00", disciplina2);
        Turma turma3 = new Turma("Turma 1 de Filosofia",professor1, "14:00", disciplina3);
        Turma turma4 = new Turma("Turma 2 de Filosofia", "16:00", disciplina3);

        professor1.getHorarios().adicionarTurma(turma1);
        professor3.getHorarios().adicionarTurma(turma4); 
        
        Aluno josefa = new Aluno("Josefa", "56456456");
        Aluno joao = new Aluno("João", "12345678");
        Aluno pedro = new Aluno("Pedro", "56789012");
        Aluno juliana = new Aluno("Juliana", "87654321");
        Aluno roberto = new Aluno("Roberto", "76543210");
        Aluno fernanda = new Aluno("Fernanda", "65432109");
        Aluno rafael = new Aluno("Rafael", "54321098");
        Aluno carlos = new Aluno("Carlos", "34567890");
        Aluno ana = new Aluno("Ana", "45678901");
        

        // turma 1 3 alunos
        turma1.adicionarAluno(josefa);
        turma1.adicionarAluno(joao);
        turma1.adicionarAluno(pedro);
       // turma1.adicionarAluno(pedro); // aluno repetido
        
       //turma 2 5 alunos
        turma2.adicionarAluno(josefa);
        turma2.adicionarAluno(juliana);
        turma2.adicionarAluno(roberto);
        turma2.adicionarAluno(fernanda);
        turma2.adicionarAluno(rafael);
        
        //turma 3 3 alunos
        turma3.adicionarAluno(josefa);
        turma3.adicionarAluno(carlos);
        turma3.adicionarAluno(ana);

        //turma 4 4 alunos
        //turma4.adicionarAluno(josefa); // josefa ja ta na disciplina
        turma4.adicionarAluno(juliana);
        turma4.adicionarAluno(roberto);
        turma4.adicionarAluno(fernanda);
        turma4.adicionarAluno(rafael);
        
        // é pra josefa ta nas turmas 1 de física, 1 de português, 1 de filosofia e 2 de filosofia 
        System.out.println(josefa.getAlunoTurma().aulas());

        //é pro professor1 estar em 2 turmas
        System.out.println(professor1.getHorarios().turmasMinistradas());

        //física tem 3 alunos
        System.out.println(disciplina1.qtdAlunos());

        //filosofia tem 7 alunos
        System.out.println(disciplina3.qtdAlunos());

        //printar os alunos da turma 1 e 2 de filosofia
        System.out.println(disciplina3.alunos());
    
     }
}