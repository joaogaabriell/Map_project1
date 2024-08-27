package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    public void testCriarProfessor() {
        Professor professor = new Professor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        assertEquals("João", professor.getNome());
        assertEquals("P001", professor.getId());
        assertEquals("Segundas e Quartas 10:00 - 12:00", professor.getHorario());
    }

    @Test
    public void testAdicionarDisciplina() {
        Professor professor = new Professor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        professor.adicionarDisciplina(disciplina);

        assertTrue(professor.getDisciplinas().contains(disciplina));
        assertEquals(1, disciplina.getAlunos().size());
    }

    @Test
    public void testAdicionarDisciplinaDuplicada() {
        Professor professor = new Professor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        professor.adicionarDisciplina(disciplina);
        professor.adicionarDisciplina(disciplina);

        assertEquals(1, professor.getDisciplinas().size());
    }
}
