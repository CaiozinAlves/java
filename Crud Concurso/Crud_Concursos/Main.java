package Crud_Concursos;

import dao.AlunoDAO;
import modelo.Aluno;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoDAO alunoDAO = new AlunoDAO();
        int opcao;

        do {
            System.out.println("\n--- MENU ALUNO ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Atualizar");
            System.out.println("4. Remover");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    alunoDAO.inserir(new Aluno(nome, idade));
                }
                case 2 -> alunoDAO.listar().forEach(System.out::println);
                case 3 -> {
                    System.out.print("ID do aluno: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Nova idade: ");
                    int idade = sc.nextInt();
                    alunoDAO.atualizar(new Aluno(id, nome, idade));
                }
                case 4 -> {
                    System.out.print("ID do aluno: ");
                    int id = sc.nextInt();
                    alunoDAO.remover(id);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
