package MAP_Project;

public class Professor {
    private int matricula;
    private String nome;
    private String horario;

    public Professor(String nome, int matricula, String horario) {
        this.nome = nome;
        this.matricula = matricula;
        this.horario = horario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " (Matrícula: " + matricula + ")";
    }
}