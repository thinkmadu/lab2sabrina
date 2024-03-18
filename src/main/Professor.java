package main;


public class Professor {
    private String nome;
    private String matricula;
    private ProfTurma horarios;

    //construtor
    public Professor(String nome, String matricula){
        
        this.nome = nome;
        this.matricula = matricula;
        this.horarios = new ProfTurma(this);
    }

    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // public List<ProfTurma> getTurmas() {
    //     return horarios;
    // }

    // public void setTurmas(List<ProfTurma> horarios) {
    //     this.horarios = horarios;
    // }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ProfTurma getHorarios() {
        return horarios;
    }
    
    // public String getHorario(String disciplina) {
    //     return horarios.get(disciplina);
    // }

    //métodos
    
      // public void adicionarHorario(String disciplina, String horario) {
      //   if (disciplina == null || horario == null) {
      //     throw new NullPointerException("Argumentos nulos não são permitidos.");
      //   }
      //   if (!horario.matches("[0-9]{2}:[0-9]{2}")) {
      //     throw new IllegalArgumentException("Horário inválido. Utilize o formato HH:MM.");
      //   }
      //   horarios.put(disciplina, horario);
      // }


    
}