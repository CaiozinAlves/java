public class ImpostoINSS {

        private String nome;
        private double salarioBruto;
        public ImpostoINSS(String nome, double salarioBruto) {
            this.nome = nome;
            this.salarioBruto = salarioBruto;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public double getSalarioBruto() {
            return salarioBruto;
        }
        public void setSalarioBruto(double salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        public double calcularINSS() {
            double imposto = 0.0;

            if (salarioBruto <= 2259.20) {
                imposto = 0;
            } else if (salarioBruto <= 2826.65) {
                imposto = (salarioBruto - 2259.20) * 0.075;
            } else if (salarioBruto <= 3751.05) {
                imposto = (2826.65 - 2259.20) * 0.075 + (salarioBruto - 2826.65) * 0.15;
            } else if (salarioBruto <= 4664.68) {
                imposto = (2826.65 - 2259.20) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salarioBruto - 3751.05) * 0.225;
            } else {
                imposto = (2826.65 - 2259.20) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225;
            }

            return imposto;
        }

        public double calcularSalarioLiquido() {
            return salarioBruto - calcularINSS();
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
            System.out.println("Imposto INSS: R$ " + String.format("%.2f", calcularINSS()));
            System.out.println("Salário Líquido: R$ " + String.format("%.2f", calcularSalarioLiquido()));
        }

        public static void main(String[] args) {

            ImpostoINSS empregado = new ImpostoINSS("Caio", 2500.00);
            empregado.exibirInformacoes();
        }

}
