public class Produto {

    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }

    public void exibirInformacoes(boolean incluirCodigo) {
        if (incluirCodigo) {
            System.out.println("Nome: " + nome);
            System.out.println("Código: " + codigo);
        }
    }

    public void exibirInformacoes(boolean incluirCodigo, boolean incluirPreco) {
        if (incluirCodigo && incluirPreco) {
            System.out.println("Nome: " + nome);
            System.out.println("Código: " + codigo);
            System.out.println("Preço: R$ " + String.format("%.2f", preco));
        }
    }

    public static void main(String[] args) {

        Produto produto = new Produto("celular", "12345", 1999.99);


        System.out.println("Exibindo apenas o nome:");
        produto.exibirInformacoes();
        System.out.println();

        System.out.println("Exibindo nome e código:");
        produto.exibirInformacoes(true);
        System.out.println();

        System.out.println("Mostrando nome, código e preço:");
        produto.exibirInformacoes(true, true);
    }
}
