package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AlunoDisciplinaTest {

    @Test
    public void testCriacaoAlunoDisciplina() {
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina(aluno, List.of(disciplina), "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        assertEquals(aluno, alunoDisciplina.getAluno());
        assertTrue(alunoDisciplina.getDisciplinas().contains(disciplina));
        assertEquals("Segundas 10:00 - 12:00 e Terças 14:00 - 16:00", alunoDisciplina.getHorario());
    }
}
