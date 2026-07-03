package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testCriarAluno() {
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        assertEquals("Carlos", aluno.getNome());
        assertEquals("A001", aluno.getId());
        assertEquals("Segundas 10:00 - 12:00", aluno.getHorario());
    }

    @Test
    public void testAdicionarDisciplina() {
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        aluno.adicionarDisciplina(disciplina);

        assertTrue(aluno.getDisciplinas().contains(disciplina));
        assertEquals(1, disciplina.getNumeroAlunos());
    }

    @Test
    public void testAdicionarDisciplinaDuplicada() {
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        aluno.adicionarDisciplina(disciplina);
        aluno.adicionarDisciplina(disciplina);

        assertEquals(1, aluno.getDisciplinas().size());
    }
}
