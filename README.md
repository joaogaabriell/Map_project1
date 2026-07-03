# Controle Acadêmico — Projeto 1 (MAP)

Projeto da disciplina de **Métodos Avançados de Programação (MAP)**: um sistema de controle acadêmico que gerencia professores, alunos, disciplinas e as associações entre eles.

## Sobre o projeto

A classe central `ControleAcademico` atua como fachada do sistema, criando as entidades e mantendo as associações:

| Classe | Descrição |
|---|---|
| `ControleAcademico` | Cria professores, alunos e disciplinas e gerencia as matrículas/alocações |
| `Professor` / `Aluno` | Entidades com nome, ID, horário e lista de disciplinas |
| `Disciplina` | Nome, código, horário, professores e alunos vinculados |
| `ProfessorDisciplina` | Associação professor ↔ disciplinas em um horário |
| `AlunoDisciplina` | Associação aluno ↔ disciplinas em um horário |

**Regra de negócio principal**: o sistema impede conflito de horário — um professor ou aluno não pode ser associado a duas disciplinas no mesmo horário (lança `RuntimeException`).

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="MAP_Project.Main"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Main`.

## Testes

```bash
mvn test
```

Os testes cobrem as entidades, as associações e a validação de conflito de horário.
