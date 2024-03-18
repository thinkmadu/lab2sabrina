package test;
import static org.junit.Assert.*;
import main.ProfTurma;
import main.Professor;
import main.Turma;
import main.Disciplina;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class TesteProfTurma {
    private ProfTurma profTurma;
    private Professor professor;
    private Turma turma1;
    private Turma turma2;

    @Before
    public void setUp() {
        professor = new Professor("João", "12345");
        profTurma = new ProfTurma(professor);
        turma1 = new Turma("Turma A", "Segunda-feira 10:00", new Disciplina("Matemática"));
        turma2 = new Turma("Turma B", "Quarta-feira 14:00", new Disciplina("Física"));
    }

    @Test
    public void testAdicionarTurma() {
        profTurma.adicionarTurma(turma1);

        assertTrue(profTurma.getListaTurmas().contains(turma1));
        assertEquals(professor, turma1.getProfessor());
    }

    @Test(expected = NullPointerException.class)
    public void testAdicionarTurmaNull() {
        profTurma.adicionarTurma(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarTurmaComProfessor() {
        turma2.setProfessor(new Professor("Maria", "54321"));
        profTurma.adicionarTurma(turma2);
    }

    @Test
    public void testTurmasMinistradas() {
        profTurma.adicionarTurma(turma1);
        profTurma.adicionarTurma(turma2);

        String resultadoEsperado = "Turmas ministradas pelo professor João:\n" +
                                   "\nTurma: Turma A\nDisciplina: Matemática\nHorário: Segunda-feira 10:00\n" +
                                   "\nTurma: Turma B\nDisciplina: Física\nHorário: Quarta-feira 14:00\n";

        assertEquals(resultadoEsperado, profTurma.turmasMinistradas());
    }

    // Você pode adicionar mais testes conforme necessário
}
