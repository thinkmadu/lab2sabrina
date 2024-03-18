package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class Aluno {
    private String nome;
    private String matricula;   
    private AlunoTurma horarios;

    protected Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.horarios = new AlunoTurma(this);
    }
    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getMatricula() {
      return matricula;
    }

    public void setMatricula(String matricula) {
      this.matricula = matricula;
    }
    public AlunoTurma getAlunoTurma() {
      return horarios;
  }
   
}