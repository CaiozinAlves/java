package Crud_Concursos;

public class Aluno {
    public int id;
    public String nome;
    public int idade;

    public Aluno(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "Aluno{id=" + id + ", nome='" + nome + "', idade=" + idade + "}";
    }
}
