package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {

    @Test
    public void testCriarDisciplina() {
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        assertEquals("Estrutura de Dados", disciplina.getNome());
        assertEquals("CS101", disciplina.getCodigo());
        assertEquals("Segundas 10:00 - 12:00", disciplina.getHorario());
    }

    @Test
    public void testAdicionarAluno() {
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        disciplina.adicionarAluno(aluno);

        assertTrue(disciplina.getAlunos().contains(aluno));
        assertEquals(1, disciplina.getNumeroAlunos());
    }

    @Test
    public void testAdicionarAlunoDuplicado() {
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00");
        disciplina.adicionarAluno(aluno);
        disciplina.adicionarAluno(aluno); // Adicionar novamente

        assertEquals(1, disciplina.getNumeroAlunos());
    }
}
