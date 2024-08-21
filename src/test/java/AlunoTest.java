package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testCriarAluno() {
        Aluno aluno = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");

        assertEquals("Ana", aluno.getNome());
        assertEquals("A002", aluno.getId());
        assertEquals("Segundas 10:00 - 12:00", aluno.getHorario());
        assertTrue(aluno.getDisciplinas().isEmpty());
    }

    @Test
    public void testAdicionarDisciplina() {
        Aluno aluno = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");

        aluno.adicionarDisciplina(disciplina);

        assertEquals(1, aluno.getDisciplinas().size());
        assertTrue(aluno.getDisciplinas().contains(disciplina));
    }
}
