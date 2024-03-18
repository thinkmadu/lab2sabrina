package test;

import main.Professor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteProfessor {

    private Professor professor;

    @Before
    public void setUp() {
        professor = new Professor("Ana Carolina", "422222");
    }

    @Test
    public void testaGetNome() {
        String nomeEsperado = "Ana Carolina";
        String nomeAtual = professor.getNome();

        assertEquals(nomeEsperado, nomeAtual);
    }

    @Test
    public void testaGetMatricula() {
        String matriculaEsperada = "422222";
        String matriculaAtual = professor.getMatricula();

        assertEquals(matriculaEsperada, matriculaAtual);
    }


    @Test
    public void testaTamanhoListaHorarios() {
        int tamanhoEsperado = 0;
        int tamanhoAtual = professor.getHorarios().getListaTurmas().size();

        assertEquals(tamanhoEsperado, tamanhoAtual);
    }
    

  

}
