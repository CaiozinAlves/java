package heranca;

public class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String marca, String modelo, Integer ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando a moto....");
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Tem carenagem: " + (temCarenagem ? "Sim" : "Não"));
    }

    public void empinar() {
        System.out.println(" empinando a moto...");
    }
}
