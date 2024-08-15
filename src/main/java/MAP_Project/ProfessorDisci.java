package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDisci {

        private Professor professor;
        private List<Disciplina> disciplinas;

        public ProfessorDisci(Professor professor) {
            this.professor = professor;
            this.disciplinas = new ArrayList<>();
        }

        public void adicionarDisci(Disciplina disciplina) {
            disciplinas.add(disciplina);
        }

        public List<Disciplina> getDisciplinas() {
            return disciplinas;
        }

        public String getHorario() {
            return professor.getHorario();
        }

        public String getNomeProfessor() {
            return professor.getNome();
        }

        @Override
        public String toString() {
            return "Professor: " + professor.getNome() + " | Disciplinas: " + disciplinas;
        }
    }

}
