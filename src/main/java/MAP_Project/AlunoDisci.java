package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class AlunoDisci {
    private Aluno aluno;
    private List<Disciplina> disciplinas;

    public AlunoDisci(Aluno aluno) {
        this.aluno = aluno;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getHorario() {
        return aluno.getHorario();
    }

    public String getNomeAluno() {
        return aluno.getNome();
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() + " | Disciplinas: " + disciplinas;
    }
}

}
