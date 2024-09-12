package Sabor_Gourmet;

public class ItemMenu {
    private String nome;
    private String categoria;
    private double preco;

    public ItemMenu(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getDetalhesItem() {
        return "Item: " + nome + " | Categoria: " + categoria + " | Preço: R$" + preco;
    }

    public double calcularPreco() {
        return preco;
    }

    // Getters e Setters (opcional, caso precise)
}
