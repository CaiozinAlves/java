
package ecommerce;

import java.util.Scanner;
// Criação de  uma instância da classe ClienteDAO para a  manipular o banco de dados.
// o uso Scanner para entrada de dados do usuário, por isso a import acima.
public class Principal {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------");
            System.out.println("Escolha uma Opção Abaixo:");
            System.out.println("1. Cadastrar um Novo Cliente");
            System.out.println("2. Lista dos Clientes");
            System.out.println("3. Procurar Cliente");
            System.out.println("4. Atualizar Cliente");
            System.out.println("5. Tirar Cliente");
            System.out.println("6. Sair");
            System.out.println("----------Obrigado----------");
            // abaixou e a leiruta do usuario

            int opcao = scanner.nextInt();
            scanner.nextLine();
            // usamos o switich em geral para fazer o CRUD
            // lista o cliente que ja esta no banca, buscar tambem por id,atualizar o cliente , excluir , sair do progrma
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String Nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String Email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String Telefone = scanner.nextLine();
                    String Data_Cadastro = java.time.LocalDate.now().toString();
                    int Cliente_ID = (int) (Math.random() * 1000);
                    Cliente cliente = new Cliente(Cliente_ID, Nome, Email, Telefone, Data_Cadastro);
                    clienteDAO.inserirCliente(cliente);
                    System.out.println("Novo cliente cadastrado com sucesso!");
                    break;

                case 2:
                    for (Cliente c : clienteDAO.listarClientes()) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.print("Informe o ID do cliente: ");
                    int idConsulta = scanner.nextInt();
                    Cliente clienteConsultado = clienteDAO.buscarCliente(idConsulta);
                    System.out.println(clienteConsultado != null ? clienteConsultado : "Cliente não encontrado!");
                    break;

                case 4:
                    System.out.print("Informe o ID do cliente a ser atualizado: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    Cliente clienteAtualizar = clienteDAO.buscarCliente(idAtualizar);
                    if (clienteAtualizar != null) {
                        System.out.print("Novo Nome: ");
                        clienteAtualizar.setNome(scanner.nextLine());
                        System.out.print("Novo Email: ");
                        clienteAtualizar.setEmail(scanner.nextLine());
                        System.out.print("Novo Telefone: ");
                        clienteAtualizar.setTelefone(scanner.nextLine());
                        clienteDAO.atualizarCliente(clienteAtualizar);
                        System.out.println("Cliente atualizado com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Informe o ID do cliente a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    clienteDAO.excluirCliente(idExcluir);
                    System.out.println("Cliente excluído com sucesso!");
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
