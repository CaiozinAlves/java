public class ProvaUniversidade {
    private double notaAV1;
    private double notaAV2;

    public ProvaUniversidade(double notaAV1, double notaAV2) {
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
    }

    public double calcularMedia() {
        return (notaAV1 + notaAV2) / 2;
    }
}