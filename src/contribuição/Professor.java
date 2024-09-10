package contribuição;

public class Professor {
    private String nome;
    private String cpf;
    private Titulacao titulacao;
    private double salario;


    public Professor(String nome, String cpf, Titulacao titulacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.titulacao = titulacao;
        this.salario = salario;
    }


    public Titulacao getTitulacao() {
        return titulacao;
    }


    public double calcularContribuicao() {
        double percentual = 0;
        switch (titulacao) {
            case Titulacao.DOUTOR:
                percentual = 0.016;
                break;
            case Titulacao.MESTRE:
                percentual = 0.014;
                break;
            case Titulacao.ESPECIALISTA:
                percentual = 0.012;
                break;
        }
        return salario * percentual;
    }
}
