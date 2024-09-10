package Alunos;
import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Alunos> alunos = new ArrayList<>();

            while (true) {
                System.out.println("Digite o número de matrícula do aluno: ");
                String matricula = scanner.nextLine();

                System.out.println("Digite a nota do aluno (de 0.0 a 10.0): ");
                double nota = scanner.nextDouble();
                scanner.nextLine();


                Alunos aluno = new Alunos(matricula, nota);
                alunos.add(aluno);

                System.out.println("Deseja adicionar mais um aluno? (S/N)");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    break;
                }
            }


            System.out.println("\nConceitos finais dos alunos:");
            for (Alunos aluno : alunos) {
                System.out.println("Matrícula: " + aluno.getMatricula() + " - Nota: " + aluno.getNota() + " - Conceito: " + aluno.obterConceito());
            }
        }


}
