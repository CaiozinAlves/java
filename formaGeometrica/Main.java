public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(4, 6);
        formas[2] = new Triangulo(3, 7);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}