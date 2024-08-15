package MAP_Project;

public class Aluno {
    private int matricula;
    private String nome;
    private String horario;

    public Aluno(int matricula, String nome, String horario) {
        this.matricula = matricula;
        this.nome = nome;
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
        return "Aluno: " + nome + " (Matrícula: " + matricula + ")";
    }
}
