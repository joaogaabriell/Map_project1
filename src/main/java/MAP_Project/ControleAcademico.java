package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    private List<ProfessorDisciplina> professorDisciplinas;
    private List<AlunoDisciplina> alunoDisciplinas;

    public ControleAcademico() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
        professorDisciplinas = new ArrayList<>();
        alunoDisciplinas = new ArrayList<>();
    }

    public Aluno criarAluno(String nome, String id, String horario) {
        Aluno novoAluno = new Aluno(nome, id, horario);
        alunos.add(novoAluno);
        return novoAluno;
    }

    public Professor criarProfessor(String nome, String id, String horario) {
        Professor novoProfessor = new Professor(nome, id, horario);
        professores.add(novoProfessor);
        return novoProfessor;
    }

    public Disciplina criarDisciplina(String nome, String codigo, String horario) {
        Disciplina novaDisciplina = new Disciplina(nome, codigo, horario);
        disciplinas.add(novaDisciplina);
        return novaDisciplina;
    }

    public AlunoDisciplina criarAlunoDisciplina(Aluno aluno, List<Disciplina> disciplinas, String horario) {
        AlunoDisciplina novoAlunoDisciplina = new AlunoDisciplina(aluno, disciplinas, horario);
        alunoDisciplinas.add(novoAlunoDisciplina);
        return novoAlunoDisciplina;
    }

    public ProfessorDisciplina criarProfessorDisciplina(Professor professor, List<Disciplina> disciplinas, String horario) {
        for (ProfessorDisciplina pd : professorDisciplinas) {
            if (pd.getProfessor().equals(professor) && pd.getHorario().equals(horario)) {
                throw new RuntimeException("O professor já está cadastrado para este horário.");
            }
        }
        ProfessorDisciplina novoProfessorDisciplina = new ProfessorDisciplina(professor, disciplinas, horario);
        professorDisciplinas.add(novoProfessorDisciplina);
        return novoProfessorDisciplina;
    }

    public void imprimirInformacoes() {
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", ID: " + aluno.getId() + ", Horário: " + aluno.getHorario());
        }

        System.out.println("Professores:");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() + ", ID: " + professor.getId() + ", Horário: " + professor.getHorario());
        }

        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("Nome: " + disciplina.getNome() + ", Código: " + disciplina.getCodigo() + ", Horário: " + disciplina.getHorario());
        }
    }
}
