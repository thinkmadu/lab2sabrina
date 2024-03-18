package test;
import main.Aluno;
import main.AlunoTurma;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteAluno {

    private Aluno aluno1;

    @Before
    public void setUp() {
        aluno1 = new Aluno("Paulo", "4545");
    }

    @Test
    public void testaGetNome() {
        String nomeEsperado = "Paulo";
        String nomeAtual = aluno1.getNome();

        assertEquals(nomeEsperado, nomeAtual);
    }

    @Test
    public void testaSetNome() {
        String novoNome = "Ana";
        aluno1.setNome(novoNome);

        assertEquals(novoNome, aluno1.getNome());
    }

    @Test
    public void testaGetMatricula() {
        String matriculaEsperada = "4545";
        String matriculaAtual = aluno1.getMatricula();

        assertEquals(matriculaEsperada, matriculaAtual);
    }

    @Test
    public void testaSetMatricula() {
        String novaMatricula = "1234";
        aluno1.setMatricula(novaMatricula);

        assertEquals(novaMatricula, aluno1.getMatricula());
    }

    @Test
    public void testaGetAlunoTurma() {
        assertNotNull(aluno1.getAlunoTurma());
        assertTrue(aluno1.getAlunoTurma() instanceof AlunoTurma);
    }


    @Test(expected = NullPointerException.class)
    public void testaGetAlunoTurmaNullPointerException() {
        Aluno alunoNulo = null;
        alunoNulo.getAlunoTurma();
    }

}
