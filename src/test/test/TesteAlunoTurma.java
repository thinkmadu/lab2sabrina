package test;
import static org.junit.Assert.*;
import main.Aluno;
import main.AlunoTurma;
import main.Turma;
import main.Disciplina;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class TesteAlunoTurma {
    private AlunoTurma alunoTurma;
    private Aluno aluno;
    private Turma turma1;
    private Turma turma2;

    @Before
    public void setUp() {
        aluno = new Aluno("Alice", "12345");
        alunoTurma = new AlunoTurma(aluno);
        turma1 = new Turma("Turma A", "Segunda-feira 10:00", new Disciplina("Matemática"));
        turma2 = new Turma("Turma B", "Quarta-feira 14:00", new Disciplina("Física"));
    }


    @Test(expected = NullPointerException.class)
    public void testAddTurmaNull() {
        alunoTurma.addTurma(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddTurmaDuplicada() {
        alunoTurma.addTurma(turma1);
        // Adicionando a mesma turma novamente deve lançar uma exceção
        alunoTurma.addTurma(turma1);
    }

    @Test
    public void testAulas() {
        alunoTurma.addTurma(turma1);
        alunoTurma.addTurma(turma2);

        String resultadoEsperado = "Turmas do aluno Alice:\n" +
                                   "\nTurma: Turma A\nDisciplina: Matemática\nHorário: Segunda-feira 10:00\n" +
                                   "\nTurma: Turma B\nDisciplina: Física\nHorário: Quarta-feira 14:00\n\n";

        assertEquals(resultadoEsperado, alunoTurma.aulas());
    }

}
