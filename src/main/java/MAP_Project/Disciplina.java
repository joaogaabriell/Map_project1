package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String nome;
    private List<Aluno> alunos;

    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public int getIdDisciplina() {
        return id;
    }

    public String getNomeDisciplina() {
        return nome;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + " (ID: " + id + ")";
    }

