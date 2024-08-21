package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String id;
    private String horario;
    private List<Disciplina> disciplinas;

    public Professor(String nome, String id, String horario) {
        this.nome = nome;
        this.id = id;
        this.horario = horario;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
