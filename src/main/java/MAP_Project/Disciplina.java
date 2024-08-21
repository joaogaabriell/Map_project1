package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private String horario;
    private List<Aluno> alunos;

    public Disciplina(String nome, String codigo, String horario) {
        this.nome = nome;
        this.codigo = codigo;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }
}
