package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AlunoDisciplinaTest {

    @Test
    public void testCriarAlunoDisciplina() {
        Aluno aluno = new Aluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
        Disciplina disciplina1 = new Disciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
        Disciplina disciplina2 = new Disciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");
        List<Disciplina> disciplinas = List.of(disciplina1, disciplina2);

        AlunoDisciplina alunoDisciplina = new AlunoDisciplina(aluno, disciplinas, "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");

        assertEquals(aluno, alunoDisciplina.getAluno());
        assertEquals(disciplinas, alunoDisciplina.getDisciplinas());
        assertEquals("Segundas 10:00 - 12:00 e Terças 14:00 - 16:00", alunoDisciplina.getHorario());
    }
}
