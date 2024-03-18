package test;
import static org.junit.Assert.*;
import main.Turma;
import main.Disciplina;
import main.Professor;
import main.Aluno;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TesteTurma {
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;

    @Before
    public void setUp() {
        disciplina = new Disciplina("Matemática");
        professor = new Professor("João", "12345");
        turma = new Turma("Turma A", professor, "Segunda-feira 10:00", disciplina);
    }

    @Test
    public void testAdicionarAluno() {
        Aluno aluno1 = new Aluno("Alice", "98765");
        Aluno aluno2 = new Aluno("Bob", "54321");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        assertTrue(turma.getAlunos().contains(aluno1));
        assertTrue(turma.getAlunos().contains(aluno2));
    }

    @Test(expected = NullPointerException.class)
    public void testAdicionarAlunoNull() {
        turma.adicionarAluno(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarAlunoExistente() {
        Aluno aluno1 = new Aluno("Alice", "98765");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno1);
    }

}
