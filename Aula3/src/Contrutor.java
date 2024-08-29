public class Contrutor {
    private double largura ;
    private  double altura;
    private  double profundidade;

    public Contrutor(){
        this.altura = 10;
        this.largura= 10;
        this.profundidade =10;

    }

    public double volume (){
        return largura + altura * profundidade;
    }

    public static void main (String[] Args){
        System.out.println("Vamos ver a dimensao da caixa");
        Contrutor caixa = new Contrutor();
        System.out.println(caixa.volume());
    }
}
