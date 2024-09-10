package contribuição;

import java.util.ArrayList;
import java.util.Scanner;

public class Sindicato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Professor> professores = new ArrayList<>();
        double totalContribuicoes = 0;
        int quantidadeMestres = 0;

        while (true) {
            System.out.println("Digite o nome do professor: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do professor: ");
            String cpf = scanner.nextLine();

            System.out.println("Digite a titulação do professor (1 - Doutor, 2 - Mestre, 3 - Especialista): ");
            int tit = scanner.nextInt();
            Titulacao titulacao;
            switch (tit) {
                case 1:
                    titulacao = Titulacao.DOUTOR;
                    break;
                case 2:
                    titulacao = Titulacao.MESTRE;
                    break;
                case 3:
                    titulacao = Titulacao.ESPECIALISTA;
                    break;
                default:
                    System.out.println("Titulação inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Digite o salário do professor: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();


            Professor professor = new Professor(nome, cpf, titulacao, salario);


            professores.add(professor);


            totalContribuicoes += professor.calcularContribuicao();


            if (professor.getTitulacao() == Titulacao.MESTRE) {
                quantidadeMestres++;
            }

            System.out.println("Deseja adicionar mais um professor? (S/N)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }


        System.out.println("Total arrecadado pelo sindicato: R$ " + totalContribuicoes);
        System.out.println("Quantidade de professores Mestres: " + quantidadeMestres);
    }
}
