package MAP_Project;

public class ControleAcademico {

    public static void main(String[] args) {
        //Instancia dos Alunos
        Aluno aluno1 = new Aluno(1, "Erick Nathan", "07:00-09:00");
        Aluno aluno2 = new Aluno(2, "Pedro Vaz", "07:00-13:00");

        //Instancias do professor
        Professor professor1 = new Professor("Klaudio", 1, "07:00-11:00");

        //Instancias das disciplinas
        Disciplina disciplina1 = new Disciplina(101, "Algoritmos");
        Disciplina disciplina2 = new Disciplina(102, "Paradigmas Da Programação");

        //Associar aluno em uma disciplina
        AlunoDisciplina alunoDisciplina1 = new AlunoDisciplina(aluno1);
        alunoDisciplina1.adicionarDisciplina(disciplina1);

        AlunoDisciplina alunoDisciplina2 = new AlunoDisciplina(aluno2);
        alunoDisciplina2.adicionarDisciplina(disciplina1);
        alunoDisciplina2.adicionarDisciplina(disciplina2);

        //Alocar professor a uma disciplina
        ProfessorDisci professorDisciplina = new ProfessorDisci(professor1);
        professorDisciplina.adicionarDisci(disciplina1);
        professorDisciplina.adicionarDisci(disciplina2);

        //Matricular alunos nas disciplinas
        disciplina1.matricularAluno(aluno1);
        disciplina1.matricularAluno(aluno2);
        disciplina2.matricularAluno(aluno2);

        //Quais disciplinas um professor está ministrando
        System.out.println("Disciplinas ministradas por " + professor1.getNome() + ": " + professorDisciplina.getDisciplinas());

        //Qual o horário de um professor
        System.out.println("Horário do professor " + professor1.getNome() + ": " + professorDisciplina.getHorario());

        //Quais os alunos de uma dada disciplina
        System.out.println("Alunos na disciplina " + disciplina1.getNomeDisciplina() + ": " + disciplina1.getAlunos());
        System.out.println("Alunos na disciplina " + disciplina2.getNomeDisciplina() + ": " + disciplina2.getAlunos());

        //Quais as disciplinas de um aluno
        System.out.println("Disciplinas de " + aluno1.getNome() + ": " + alunoDisciplina1.getDisciplinas());
        System.out.println("Disciplinas de " + aluno2.getNome() + ": " + alunoDisciplina2.getDisciplinas());

        //Qual o horário de um aluno
        System.out.println("Horário do aluno " + aluno1.getNome() + ": " + alunoDisciplina1.getHorario());
        System.out.println("Horário do aluno " + aluno2.getNome() + ": " + alunoDisciplina2.getHorario());

        //Qual o número de alunos de uma disciplina
        System.out.println("Número de alunos na disciplina " + disciplina1.getNomeDisciplina() + ": " + disciplina1.getNumeroAlunos());
        System.out.println("Número de alunos na disciplina " + disciplina2.getNomeDisciplina() + ": " + disciplina2.getNumeroAlunos());
    }

