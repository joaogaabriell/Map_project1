package MAP_Project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ControleAcademicoTest {

    @Test
    public void testAdicionarEImprimirInformacoes() {
        ControleAcademico controle = new ControleAcademico();

        Professor professor = new Professor("Maria", "P002", "Terças e Quintas 14:00 - 16:00");
        Disciplina disciplina = new Disciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");
        Aluno aluno = new Aluno("Ana", "A002", "Segundas 10:00 - 12:00");

        professor.adicionarDisciplina(disciplina);
        aluno.adicionarDisciplina(disciplina);
        disciplina.adicionarAluno(aluno);

        ProfessorDisciplina professorDisciplina = new ProfessorDisciplina(professor, List.of(disciplina), "Terças e Quintas 14:00 - 16:00");
        AlunoDisciplina alunoDisciplina = new AlunoDisciplina(aluno, List.of(disciplina), "Segundas 10:00 - 12:00");

        controle.adicionarProfessorDisciplina(professorDisciplina);
        controle.adicionarAlunoDisciplina(alunoDisciplina);
        controle.adicionarDisciplina(disciplina);
        controle.adicionarProfessor(professor);
        controle.adicionarAluno(aluno);


        assertDoesNotThrow(() -> controle.imprimirInformacoes());
    }
}
