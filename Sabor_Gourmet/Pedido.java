package Sabor_Gourmet;

public class Pedido {
    private ItemMenu[] itens;
    private Cliente cliente;
    private double total;
    private String status;
    private int contadorItens = 0;

    public Pedido(Cliente cliente, int capacidade) {
        this.itens = new ItemMenu[capacidade];
        this.cliente = cliente;
        this.status = "Fazendo o Pedido";
    }

    public void adicionarItem(ItemMenu item) {
        if (contadorItens < itens.length) {
            itens[contadorItens] = item;
            contadorItens++;
            System.out.println("adicionado o pedido: " + item.getDetalhesItem());
        } else {
            System.out.println("Pedido cheio.");
        }
    }

    public double calcularTotal() {
        total = 0;
        for (int i = 0; i < contadorItens; i++) {
            total += itens[i].calcularPreco();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status atualizado para: " + status);
    }

    public void visualizarPedido() {
        System.out.println("Pedido do cliente: " + cliente);
        for (int i = 0; i < contadorItens; i++) {
            System.out.println(itens[i].getDetalhesItem());
        }
        System.out.println("Total: R$" + calcularTotal());
        System.out.println("Status: " + status);
    }
}
