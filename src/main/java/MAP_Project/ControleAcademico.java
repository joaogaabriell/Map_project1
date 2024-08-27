package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {

    private List<ProfessorDisciplina> professorDisciplinas;
    private List<AlunoDisciplina> alunoDisciplinas;
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public ControleAcademico() {
        this.professorDisciplinas = new ArrayList<>();
        this.alunoDisciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public Professor criarProfessor(String nome, String id, String horario) {
        Professor professor = new Professor(nome, id, horario);
        professores.add(professor);
        return professor;
    }

    public Aluno criarAluno(String nome, String id, String horario) {
        Aluno aluno = new Aluno(nome, id, horario);
        alunos.add(aluno);
        return aluno;
    }

    public Disciplina criarDisciplina(String nome, String codigo, String horario) {
        Disciplina disciplina = new Disciplina(nome, codigo, horario);
        disciplinas.add(disciplina);
        return disciplina;
    }

    public ProfessorDisciplina criarProfessorDisciplina(Professor professor, List<Disciplina> disciplinas, String horario) {
        for (ProfessorDisciplina pd : professorDisciplinas) {
            if (pd.getProfessor().equals(professor) && pd.getHorario().equals(horario)) {
                throw new RuntimeException("Professor já está associado a uma disciplina no mesmo horário.");
            }
        }
        ProfessorDisciplina professorDisciplina = new ProfessorDisciplina(professor, disciplinas, horario);
        professorDisciplinas.add(professorDisciplina);

        for (Disciplina disciplina : disciplinas) {
            professor.adicionarDisciplina(disciplina);
        }
        return professorDisciplina;
    }

    public AlunoDisciplina criarAlunoDisciplina(Aluno aluno, List<Disciplina> disciplinas, String horario) {
        for (AlunoDisciplina ad : alunoDisciplinas) {
            if (ad.getAluno().equals(aluno) && ad.getHorario().equals(horario)) {
                throw new RuntimeException("Aluno já está associado a uma disciplina no mesmo horário.");
            }
        }
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina(aluno, disciplinas, horario);
        alunoDisciplinas.add(alunoDisciplina);

        for (Disciplina disciplina : disciplinas) {
            aluno.adicionarDisciplina(disciplina);
        }
        return alunoDisciplina;
    }

    public void imprimirInformacoes() {
        System.out.println("Informações de Professores e Alunos:");
        for (ProfessorDisciplina pd : professorDisciplinas) {
            System.out.println("Professor: " + pd.getProfessor().getNome() + ", Disciplinas: " + pd.getDisciplinas() + ", Horário: " + pd.getHorario());
        }
        for (AlunoDisciplina ad : alunoDisciplinas) {
            System.out.println("Aluno: " + ad.getAluno().getNome() + ", Disciplinas: " + ad.getDisciplinas() + ", Horário: " + ad.getHorario());
        }
    }
}
