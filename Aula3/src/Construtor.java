public class Construtor {
    private double largura;
    private double altura;
    private double profundidade;



    public Construtor(double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }


    public double volume() {
        return largura * altura * profundidade;
    }

    public static void main(String[] args) {
        System.out.println("Vamos ver as dimensões das caixas");


        Construtor caixa1 = new Construtor(15, 5 ,10);
        Construtor caixa2 = new Construtor(5, 5, 5);
        Construtor caixa3 = new Construtor(7, 8, 9);


        System.out.println("Volume da caixa padrão: " + caixa1.volume() + " cm³");
        System.out.println("Volume da caixa 2 (5x5x5): " + caixa2.volume() + " cm³");
        System.out.println("Volume da caixa 3 (7x8x9): " + caixa3.volume() + " cm³");
    }
}
