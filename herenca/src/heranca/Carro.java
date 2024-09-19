package heranca;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, Integer ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void acelerar() {
        System.out.println(" acelerando o carro...");
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Carro - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Portas: " + portas);
    }

    public void abrirPortaMala() {
        System.out.println("Abrindo o porta mala...");
    }
}
