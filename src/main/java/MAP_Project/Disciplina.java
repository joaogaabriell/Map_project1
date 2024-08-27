package MAP_Project;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private String horario;
    private List<Aluno> alunos;
    private List<Professor> professores; // Adicionando lista de professores

    public Disciplina(String nome, String codigo, String horario) {
        this.nome = nome;
        this.codigo = codigo;
        this.horario = horario;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
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
        if (aluno != null && !alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        if (professor != null && !professores.contains(professor)) {
            professores.add(professor);
        }
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }
}
