package MAP_Project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ControleAcademico controle = new ControleAcademico();

            Professor professor1 = controle.criarProfessor("João", "P001", "Segundas e Quartas 10:00 - 12:00");
            Professor professor2 = controle.criarProfessor("Maria", "P002", "Terças e Quintas 14:00 - 16:00");

            Disciplina disciplina1 = controle.criarDisciplina("Estrutura de Dados", "CS101", "Segundas 10:00 - 12:00");
            Disciplina disciplina2 = controle.criarDisciplina("Algoritmos", "CS102", "Terças 14:00 - 16:00");

            ProfessorDisciplina professorDisciplina1 = controle.criarProfessorDisciplina(professor1, List.of(disciplina1), "Segundas e Quartas 10:00 - 12:00");
            ProfessorDisciplina professorDisciplina2 = controle.criarProfessorDisciplina(professor2, List.of(disciplina2), "Terças e Quintas 14:00 - 16:00");

            Aluno aluno1 = controle.criarAluno("Carlos", "A001", "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
            Aluno aluno2 = controle.criarAluno("Ana", "A002", "Segundas 10:00 - 12:00");

            AlunoDisciplina alunoDisciplina1 = controle.criarAlunoDisciplina(aluno1, List.of(disciplina1, disciplina2), "Segundas 10:00 - 12:00 e Terças 14:00 - 16:00");
            AlunoDisciplina alunoDisciplina2 = controle.criarAlunoDisciplina(aluno2, List.of(disciplina1), "Segundas 10:00 - 12:00");

            try {
                controle.criarProfessorDisciplina(professor1, List.of(disciplina2), "Segundas e Quartas 10:00 - 12:00");
            } catch (RuntimeException e) {
                System.out.println("Erro ao adicionar ProfessorDisciplina: " + e.getMessage());
            }

            controle.imprimirInformacoes();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
