package heranca;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("volkswagen", "Fusca", 1996,2);
        Moto moto = new Moto("Honda", "CB100", 2022, true);


        carro.acelerar();
        carro.abrirPortaMala();
        carro.exibirInformacao();


        moto.acelerar();
        moto.empinar();
        moto.exibirInformacao();
    }
}
