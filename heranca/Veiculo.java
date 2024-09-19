package heranca;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected Integer ano;


    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void exibirInformacao() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}
