package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    public void testCriarProfessor() {
        Professor professor = new Professor("Maria", "P002", "Terças e Quintas 14:00 - 16:00");

        assertEquals("Maria", professor.getNome());
        assertEquals("P002", professor.getId());
        assertEquals("Terças e Quintas 14:00 - 16:00", professor.getHorario());
        assertTrue(professor.getDisciplinas().isEmpty());
    }

    @Test
    public void testAdicionarDisciplina() {
        Professor professor = new Professor("Maria", "P002", "Terças e Quintas 14:00 - 16:00");
        Disciplina disciplina = new Disciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");

        professor.adicionarDisciplina(disciplina);

        assertEquals(1, professor.getDisciplinas().size());
        assertTrue(professor.getDisciplinas().contains(disciplina));
    }
}
