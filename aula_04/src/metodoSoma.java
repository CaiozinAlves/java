public class metodoSoma {

    //inteiros
    public   int somar (int a, int b){
        return a + b;
    }
    //tres num inteiro
    public  int somar (int a, int b, int c){
        return a + b + c;
    }
    //decimais
    public  double somar (double a, double b){
        return a + b;
    }
    //inteiros e decimais
    public  double somar (int a, double b){
        return a + b;
    }
    // dois decimais e um inteiro
    public  double somar(double a, double b , int c){
        return  a + b + c;
    }

    public  static void  main (String[]arg) {
        metodoSoma calculadora = new metodoSoma();

        int somaInt = calculadora.somar(10, 5);
        System.out.println("A soma de dois inteiros e :" + somaInt);

        int somaTresInt = calculadora.somar(2, 6, 8);
        System.out.println("Soma de tres numeros inteiros:" + somaTresInt);

        double somaDouble = calculadora.somar(5.2, 15.8 );
        System.out.println("calculo dos decimais : " +somaDouble);

        double somaDoubleInt = calculadora.somar(5.5, 15.5, 25);
        System.out.println("Calculo de dois numeros decimais e um inteiro: " +somaDoubleInt);

    }

}
