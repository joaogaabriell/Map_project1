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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
