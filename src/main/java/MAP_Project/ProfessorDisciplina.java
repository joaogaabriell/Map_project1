package MAP_Project;

import java.util.List;

public class ProfessorDisciplina {
    private Professor professor;
    private List<Disciplina> disciplinas;
    private String horario;

    public ProfessorDisciplina(Professor professor, List<Disciplina> disciplinas, String horario) {
        this.professor = professor;
        this.disciplinas = disciplinas;
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getHorario() {
        return horario;
    }
}
