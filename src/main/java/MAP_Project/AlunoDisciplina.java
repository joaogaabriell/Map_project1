package MAP_Project;

import java.util.List;

public class AlunoDisciplina {
    private Aluno aluno;
    private List<Disciplina> disciplinas;
    private String horario;

    public AlunoDisciplina(Aluno aluno, List<Disciplina> disciplinas, String horario) {
        this.aluno = aluno;
        this.disciplinas = disciplinas;
        this.horario = horario;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
