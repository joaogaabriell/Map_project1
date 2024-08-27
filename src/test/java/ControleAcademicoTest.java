package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintWriter;
import java.util.List;

public class ControleAcademicoTest {

    @Test
    public void testCriarProfessor() {
        ControleAcademico controle = new ControleAcademico();
        Professor professor = controle.criarProfessor("João", "P001", "Segundas e Quartas 10:00 - 12:00");

        assertNotNull(professor);
        assertEquals("João", professor.getNome());
        assertEquals("P001", professor.getId());
        assertEquals("Segundas e Quartas 10:00 - 12:00", professor.getHorario());
    }

    @Test
    public void testCriarAluno() {
        ControleAcademico controle = new ControleAcademico();
        Aluno aluno = controle.criarAluno("Carlos", "A001", "Segundas 10:00 - 12:00");

        assertNotNull(aluno);
        assertEquals("Carlos", aluno.getNome());
        assertEquals("A001", aluno.getId());
        assertEquals("Segundas 10:00 - 12:00", aluno.getHorario());
    }

    @Test
    public void testCriarDisciplina() {
        ControleAcademico controle = new ControleAcademico();
        Disciplina disciplina = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");

        assertNotNull(disciplina);
        assertEquals("Estrutura de Dados", disciplina.getNome());
        assertEquals("CS101", disciplina.getCodigo());
        assertEquals("Segundas 10:00 - 12:00", disciplina.getHorario());
    }

    @Test
    public void testCriarProfessorDisciplina() {
        ControleAcademico controle = new ControleAcademico();
        Professor professor = controle.criarProfessor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");

        ProfessorDisciplina professorDisciplina = controle.criarProfessorDisciplina(professor, List.of(disciplina), "Segundas e Quartas 10:00 - 12:00");

        assertNotNull(professorDisciplina);
        assertEquals(professor, professorDisciplina.getProfessor());
        assertEquals(List.of(disciplina), professorDisciplina.getDisciplinas());
        assertEquals("Segundas e Quartas 10:00 - 12:00", professorDisciplina.getHorario());
    }

    @Test
    public void testCriarAlunoDisciplina() {
        ControleAcademico controle = new ControleAcademico();
        Aluno aluno = controle.criarAluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        Disciplina disciplina = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");

        AlunoDisciplina alunoDisciplina = controle.criarAlunoDisciplina(aluno, List.of(disciplina), "Segundas 10:00 - 12:00");

        assertNotNull(alunoDisciplina);
        assertEquals(aluno, alunoDisciplina.getAluno());
        assertEquals(List.of(disciplina), alunoDisciplina.getDisciplinas());
        assertEquals("Segundas 10:00 - 12:00", alunoDisciplina.getHorario());
    }

    @Test
    public void testCriarProfessorDisciplinaComHorarioConflitante() {
        ControleAcademico controle = new ControleAcademico();
        Professor professor = controle.criarProfessor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina1 = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Disciplina disciplina2 = controle.criarDisciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");

        controle.criarProfessorDisciplina(professor, List.of(disciplina1), "Segundas e Quartas 10:00 - 12:00");

        RuntimeException thrown = assertThrows(RuntimeException.class, () ->
                controle.criarProfessorDisciplina(professor, List.of(disciplina2), "Segundas e Quartas 10:00 - 12:00")
        );

        assertEquals("Professor já está associado a uma disciplina no mesmo horário.", thrown.getMessage());
    }

    @Test
    public void testCriarAlunoDisciplinaComHorarioConflitante() {
        ControleAcademico controle = new ControleAcademico();
        Aluno aluno = controle.criarAluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        Disciplina disciplina1 = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Disciplina disciplina2 = controle.criarDisciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");

        controle.criarAlunoDisciplina(aluno, List.of(disciplina1), "Segundas 10:00 - 12:00");

        RuntimeException thrown = assertThrows(RuntimeException.class, () ->
                controle.criarAlunoDisciplina(aluno, List.of(disciplina2), "Segundas 10:00 - 12:00")
        );

        assertEquals("Aluno já está associado a uma disciplina no mesmo horário.", thrown.getMessage());
    }

}