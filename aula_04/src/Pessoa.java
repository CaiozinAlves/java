public class Pessoa {
    private String nome;
    private double salarioBruto;
    public Pessoa(String nome, double salarioBruto) {
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

    public double calcularImposto() {
        double imposto = 0.0;

        if (salarioBruto <= 22847.76) {
            imposto = 0; // Isento
        } else if (salarioBruto <= 33919.80) {
            imposto = (salarioBruto - 22847.76) * 0.075;
        } else if (salarioBruto <= 45012.60) {
            imposto = (33919.80 - 22847.76) * 0.075 + (salarioBruto - 33919.80) * 0.15;
        } else if (salarioBruto <= 55976.16) {
            imposto = (33919.80 - 22847.76) * 0.075 + (45012.60 - 33919.80) * 0.15 + (salarioBruto - 45012.60) * 0.225;
        } else {
            imposto = (33919.80 - 22847.76) * 0.075 + (45012.60 - 33919.80) * 0.15 + (55976.16 - 45012.60) * 0.225 + (salarioBruto - 55976.16) * 0.275;
        }

        return imposto;
    }

    public double calcularSalarioLiquido() {
        return salarioBruto - calcularImposto();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Imposto de Renda: R$ " + String.format("%.2f", calcularImposto()));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", calcularSalarioLiquido()));
    }

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Rafael", 25000.00);
        pessoa.exibirInformacoes();
    }
}
