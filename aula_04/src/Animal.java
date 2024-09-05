
abstract class Animal {

    private String nome;
    private int idade;


    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public abstract void emitirSom();
    public abstract void mover();


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}


class Cachorro extends Animal {


    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au!");
    }


    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }
}


class Gato extends Animal {


    public Gato(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }


    @Override
    public void mover() {
        System.out.println("O gato está pulando.");
    }
}

// Classe Principal Main
public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Miau", 3);


        cachorro.exibirInformacoes();
        cachorro.emitirSom();
        cachorro.mover();
        System.out.println();

        gato.exibirInformacoes();
        gato.emitirSom();
        gato.mover();
    }
}
