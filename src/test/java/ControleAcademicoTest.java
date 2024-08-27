package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ControleAcademicoTest {

    @Test
    public void testCriarProfessorDisciplinaComHorarioConflitante() {
        ControleAcademico controle = new ControleAcademico();
        Professor professor = controle.criarProfessor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");

        controle.criarProfessorDisciplina(professor, List.of(disciplina), "Segundas e Quartas 10:00 - 12:00");

        RuntimeException thrown = assertThrows(RuntimeException.class, () ->
                controle.criarProfessorDisciplina(professor, List.of(disciplina), "Segundas e Quartas 10:00 - 12:00")
        );

        assertEquals("O professor já está cadastrado para este horário.", thrown.getMessage());
    }

    @Test
    public void testAdicionarAlunoEDisciplina() {
        ControleAcademico controle = new ControleAcademico();
        Professor professor = controle.criarProfessor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Aluno aluno = controle.criarAluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");

        controle.criarProfessorDisciplina(professor, List.of(disciplina), "Segundas e Quartas 10:00 - 12:00");
        controle.criarAlunoDisciplina(aluno, List.of(disciplina), "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");

        assertTrue(aluno.getDisciplinas().contains(disciplina));
        assertTrue(disciplina.getAlunos().contains(aluno));
    }
}
