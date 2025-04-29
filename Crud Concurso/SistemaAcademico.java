import java.util.*;

class Aluno {
    int id;
    String nome;
    int idade;

    Aluno(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "Aluno{id=" + id + ", nome='" + nome + "', idade=" + idade + "}";
    }
}

class Professor {
    int id;
    String nome;
    String especialidade;

    Professor(int id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String toString() {
        return "Professor{id=" + id + ", nome='" + nome + "', especialidade='" + especialidade + "'}";
    }
}

class Curso {
    int id;
    String nome;
    int professorId;

    Curso(int id, String nome, int professorId) {
        this.id = id;
        this.nome = nome;
        this.professorId = professorId;
    }

    public String toString() {
        return "Curso{id=" + id + ", nome='" + nome + "', professorId=" + professorId + "}";
    }
}

public class SistemaAcademico {
    static Scanner scanner = new Scanner(System.in);
    static List<Aluno> alunos = new ArrayList<>();
    static List<Professor> professores = new ArrayList<>();
    static List<Curso> cursos = new ArrayList<>();
    static int idAluno = 1, idProfessor = 1, idCurso = 1;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Gerenciar Aluno");
            System.out.println("2. Gerenciar Professor");
            System.out.println("3. Gerenciar Curso");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: menuAluno(); break;
                case 2: menuProfessor(); break;
                case 3: menuCurso(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Parte CRUD do ALUNO
    public static void menuAluno() {
        System.out.println("\n--- CRUD ALUNO ---");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Atualizar");
        System.out.println("4. Remover");
        int op = scanner.nextInt(); scanner.nextLine();
        switch (op) {
            case 1 -> {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                alunos.add(new Aluno(idAluno++, nome, idade));
                System.out.println("Aluno cadastrado!");
            }
            case 2 -> alunos.forEach(System.out::println);
            case 3 -> {
                System.out.print("ID do aluno: ");
                int id = scanner.nextInt(); scanner.nextLine();
                for (Aluno a : alunos) {
                    if (a.id == id) {
                        System.out.print("Novo nome: ");
                        a.nome = scanner.nextLine();
                        System.out.print("Nova idade: ");
                        a.idade = scanner.nextInt();
                        System.out.println("Atualizado!");
                        return;
                    }
                }
                System.out.println("Aluno não encontrado!");
            }
            case 4 -> {
                System.out.print("ID do aluno: ");
                int id = scanner.nextInt();
                alunos.removeIf(a -> a.id == id);
                System.out.println("Removido (se existia)!");
            }
        }
    }

    // Parte CRUD do Professor
    public static void menuProfessor() {
        System.out.println("\n--- CRUD PROFESSOR ---");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Atualizar");
        System.out.println("4. Remover");
        int op = scanner.nextInt(); scanner.nextLine();
        switch (op) {
            case 1 -> {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Especialidade: ");
                String esp = scanner.nextLine();
                professores.add(new Professor(idProfessor++, nome, esp));
                System.out.println("Professor cadastrado!");
            }
            case 2 -> professores.forEach(System.out::println);
            case 3 -> {
                System.out.print("ID do professor: ");
                int id = scanner.nextInt(); scanner.nextLine();
                for (Professor p : professores) {
                    if (p.id == id) {
                        System.out.print("Novo nome: ");
                        p.nome = scanner.nextLine();
                        System.out.print("Nova especialidade: ");
                        p.especialidade = scanner.nextLine();
                        System.out.println("Atualizado!");
                        return;
                    }
                }
                System.out.println("Professor não encontrado!");
            }
            case 4 -> {
                System.out.print("ID do professor: ");
                int id = scanner.nextInt();
                professores.removeIf(p -> p.id == id);
                System.out.println("Removido (se existia)!");
            }
        }
    }

    // Parte CRUD do Curso
    public static void menuCurso() {
        System.out.println("\n--- CRUD CURSO ---");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Atualizar");
        System.out.println("4. Remover");
        int op = scanner.nextInt(); scanner.nextLine();
        switch (op) {
            case 1 -> {
                System.out.print("Nome do curso: ");
                String nome = scanner.nextLine();
                System.out.print("ID do professor responsável: ");
                int profId = scanner.nextInt();
                cursos.add(new Curso(idCurso++, nome, profId));
                System.out.println("Curso cadastrado!");
            }
            case 2 -> cursos.forEach(System.out::println);
            case 3 -> {
                System.out.print("ID do curso: ");
                int id = scanner.nextInt(); scanner.nextLine();
                for (Curso c : cursos) {
                    if (c.id == id) {
                        System.out.print("Novo nome: ");
                        c.nome = scanner.nextLine();
                        System.out.print("Novo professor ID: ");
                        c.professorId = scanner.nextInt();
                        System.out.println("Atualizado!");
                        return;
                    }
                }
                System.out.println("Curso não encontrado!");
            }
            case 4 -> {
                System.out.print("ID do curso: ");
                int id = scanner.nextInt();
                cursos.removeIf(c -> c.id == id);
                System.out.println("Removido (se existia)!");
            }
        }
    }
}
