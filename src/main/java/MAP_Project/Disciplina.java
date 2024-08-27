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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        } else {
            System.out.println("O aluno já está matriculado nesta disciplina.");
        }
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }
}
