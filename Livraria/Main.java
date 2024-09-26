import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de livros
        ArrayList<Livro> livros = new ArrayList<>();

        // Adicionando livros e ebooks na lista
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 120.00));
        livros.add(new Ebook("Clean Code", "Robert C. Martin", 89.90, 2.5));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 45.00));
        livros.add(new Ebook("Java: The Complete Reference", "Herbert Schildt", 99.90, 5.0));

        // Loop para exibir os detalhes de todos os livros na lista
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println(); // Para separar os detalhes de cada livro
        }
    }
}