package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ProfessorDisciplinaTest {

    @Test
    public void testCriarProfessorDisciplina() {
        Professor professor = new Professor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        List<Disciplina> disciplinas = List.of(disciplina);

        ProfessorDisciplina professorDisciplina = new ProfessorDisciplina(professor, disciplinas, "Segundas e Quartas 10:00 - 12:00");

        assertEquals(professor, professorDisciplina.getProfessor());
        assertEquals(disciplinas, professorDisciplina.getDisciplinas());
        assertEquals("Segundas e Quartas 10:00 - 12:00", professorDisciplina.getHorario());
    }
}
