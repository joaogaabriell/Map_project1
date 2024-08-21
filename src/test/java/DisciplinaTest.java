package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaTest {

    @Test
    public void testCriarDisciplina() {
        Professor professor = new Professor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
        Disciplina disciplina = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");

        assertEquals("Estrutura de Dados", disciplina.getNome());
        assertEquals("CS101", disciplina.getCodigo());
        assertEquals("Segundas 10:00 - 12:00", disciplina.getHorario());
        assertTrue(disciplina.getAlunos().isEmpty());
    }

    @Test
    public void testAdicionarAluno() {
        Disciplina disciplina = new Disciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");

        disciplina.adicionarAluno(aluno);

        assertEquals(1, disciplina.getNumeroAlunos());
        assertTrue(disciplina.getAlunos().contains(aluno));
    }
}
