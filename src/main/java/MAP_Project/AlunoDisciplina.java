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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getHorario() {
        return horario;
    }
}
