public class CalculadoraArea {

        public double calcularArea(double lado) {
            return lado * lado;
        }
        public double calcularArea(double largura, double altura) {
            return largura * altura;
        }

        public double calcularArea(double raio, boolean isCirculo) {
            if (isCirculo) {
                return Math.PI * raio * raio;
            }
            return 0;
        }

        public static void main(String[] args) {
            CalculadoraArea calculadora = new CalculadoraArea();

            double areaQuadrado = calculadora.calcularArea(5.0);
            System.out.println("Área do quadrado: " + areaQuadrado);

            double areaRetangulo = calculadora.calcularArea(4.0, 6.0);
            System.out.println("Área do retângulo: " + areaRetangulo);

            double areaCirculo = calculadora.calcularArea(3.0, true);
            System.out.println("Área do círculo: " + areaCirculo);
        }


}
