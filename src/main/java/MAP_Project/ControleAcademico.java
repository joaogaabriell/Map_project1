package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {
    private List<AlunoDisciplina> alunoDisciplinas;
    private List<ProfessorDisciplina> professorDisciplinas;
    private List<Disciplina> disciplinas;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public ControleAcademico() {
        this.alunoDisciplinas = new ArrayList<>();
        this.professorDisciplinas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarAlunoDisciplina(AlunoDisciplina alunoDisciplina) {
        alunoDisciplinas.add(alunoDisciplina);
    }

    public void adicionarProfessorDisciplina(ProfessorDisciplina professorDisciplina) {
        professorDisciplinas.add(professorDisciplina);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirInformacoes() {
        System.out.println("Professores:");
        for (ProfessorDisciplina pd : professorDisciplinas) {
            Professor professor = pd.getProfessor();
            System.out.println("Nome: " + professor.getNome() + ", ID: " + professor.getId());
            System.out.println("Horário: " + pd.getHorario());
            System.out.println("Disciplinas:");
            for (Disciplina d : pd.getDisciplinas()) {
                System.out.println(" - " + d.getNome() + " (" + d.getCodigo() + ") - Horário: " + d.getHorario());
            }
            System.out.println();
        }

        System.out.println("Alunos:");
        for (AlunoDisciplina ad : alunoDisciplinas) {
            Aluno aluno = ad.getAluno();
            System.out.println("Nome: " + aluno.getNome() + ", ID: " + aluno.getId());
            System.out.println("Horário: " + ad.getHorario());
            System.out.println("Disciplinas:");
            for (Disciplina d : ad.getDisciplinas()) {
                System.out.println(" - " + d.getNome() + " (" + d.getCodigo() + ") - Horário: " + d.getHorario());
            }
            System.out.println();
        }

        System.out.println("Disciplinas:");
        for (Disciplina d : disciplinas) {
            System.out.println("Nome: " + d.getNome() + ", Código: " + d.getCodigo() + ", Horário: " + d.getHorario());
            System.out.println("Número de Alunos: " + d.getNumeroAlunos());
            System.out.println("Alunos:");
            for (Aluno a : d.getAlunos()) {
                System.out.println(" - " + a.getNome() + " (" + a.getId() + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Criação de professores e disciplinas
        Professor professor1 = new Professor("Joao", "P001", "Segundas e Quartas 10:00 - 12:00");
        Professor professor2 = new Professor("Maria", "P002", "Terças e Quintas 14:00 - 16:00");

        Disciplina disciplina1 = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Disciplina disciplina2 = new Disciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");

        ProfessorDisciplina professorDisciplina1 = new ProfessorDisciplina(professor1, List.of(disciplina1), "Segundas e Quartas 10:00 - 12:00");
        ProfessorDisciplina professorDisciplina2 = new ProfessorDisciplina(professor2, List.of(disciplina2), "Terças e Quintas 14:00 - 16:00");

        Aluno aluno1 = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        Aluno aluno2 = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");

        AlunoDisciplina alunoDisciplina1 = new AlunoDisciplina(aluno1, List.of(disciplina1, disciplina2), "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        AlunoDisciplina alunoDisciplina2 = new AlunoDisciplina(aluno2, List.of(disciplina1), "Segundas 10:00 - 12:00");

        // Controle acadêmico para gerenciar os relacionamentos
        ControleAcademico controle = new ControleAcademico();
        controle.adicionarDisciplina(disciplina1);
        controle.adicionarDisciplina(disciplina2);
        controle.adicionarProfessor(professor1);
        controle.adicionarProfessor(professor2);
        controle.adicionarAluno(aluno1);
        controle.adicionarAluno(aluno2);
        controle.adicionarAlunoDisciplina(alunoDisciplina1);
        controle.adicionarAlunoDisciplina(alunoDisciplina2);
        controle.adicionarProfessorDisciplina(professorDisciplina1);
        controle.adicionarProfessorDisciplina(professorDisciplina2);


        controle.imprimirInformacoes();
    }
}
