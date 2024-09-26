public class Ebook extends Livro {
    private double tamanhoArquivo; // Em MB

    public Ebook(String titulo, String autor, double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}