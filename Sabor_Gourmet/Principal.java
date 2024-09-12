package Sabor_Gourmet;
import java.util.Scanner;

public class Principal {
    private static Cliente[] clientes = new Cliente[10];
    private static ItemMenu[] menu = new ItemMenu[5];
    private static Pedido[] pedidos = new Pedido[10];
    private static int contadorClientes = 0;
    private static int contadorPedidos = 0;

    public static void main(String[] args) {
        inicializarMenu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" |--- Bem-vindo ao Sabor Gourmet! ---|");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Visualizar Menu");
            System.out.println("3. Fazer Pedido");
            System.out.println("4. Acompanhar Pedido");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarCliente(scanner);
                    break;
                case 2:
                    visualizarMenu();
                    break;
                case 3:
                    fazerPedido(scanner);
                    break;
                case 4:
                    acompanharPedido(scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção invalida.");
            }
        }
    }

    private static void inicializarMenu() {
        menu[0] = new ItemMenu("(0)Pizza Carne de Sol", "Pizza", 50.00);
        menu[1] = new ItemMenu("(1)Lasanha", "Massa", 35.00);
        menu[2] = new ItemMenu("(2)Cuscuz com ovo", "Salada", 35.00);
        menu[3] = new ItemMenu("(3)Hambúrguer", "Lanche", 25.00);
        menu[4] = new ItemMenu("(4)Goiabada com Creme de Leite", "Sobremesa", 15.00);
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, endereco, telefone);
        if (contadorClientes < clientes.length) {
            clientes[contadorClientes] = cliente;
            contadorClientes++;
            cliente.registrarCliente();
        } else {
            System.out.println("Limite de clientes atingido.");
        }
    }

    private static void visualizarMenu() {
        System.out.println(" |--- Menu do Restaurante: ---|");
        for (ItemMenu item : menu) {
            if (item != null) {
                System.out.println(item.getDetalhesItem());
            }
        }
    }

    private static void fazerPedido(Scanner scanner) {
        System.out.println("Digite 0 se for primeiro cliente para ver o pedido(caso tenha mais clientes seguir a ordem de numerica 1,2,3...):");
        int indiceCliente = scanner.nextInt();
        scanner.nextLine();

        if (indiceCliente < 0 || indiceCliente >= contadorClientes) {
            System.out.println("Cliente invalido.");
            return;
        }

        Cliente cliente = clientes[indiceCliente];
        Pedido pedido = new Pedido(cliente, 10);

        while (true) {
            System.out.println("Digite o numero do item para adicionar ao pedido (ou -1 para finalizar):");
            int indiceItem = scanner.nextInt();

            if (indiceItem == -1) {
                break;
            }

            if (indiceItem < 0 || indiceItem >= menu.length || menu[indiceItem] == null) {
                System.out.println("Item invalido.");
            } else {
                pedido.adicionarItem(menu[indiceItem]);
            }
        }

        if (contadorPedidos < pedidos.length) {
            pedidos[contadorPedidos] = pedido;
            contadorPedidos++;
            System.out.println("Pedido realizado com sucesso.");
        } else {
            System.out.println("Limite de pedidos atingido.");
        }
    }

    private static void acompanharPedido(Scanner scanner) {
        System.out.println("Digite 0 se for primeiro cliente para acompanhar o pedido" +
                "(caso tenha mais clientes seguir a ordem de numerica 1,2,3...:");
        int indicePedido = scanner.nextInt();

        if (indicePedido < 0 || indicePedido >= contadorPedidos) {
            System.out.println("Pedido inválido.");
            return;
        }

        Pedido pedido = pedidos[indicePedido];
        pedido.visualizarPedido();
    }
}
