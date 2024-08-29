public class exercoes {
    public static void main (String[]args){ try {
     int resultado = dividir(10, 0); //Tentativa de dividir por 0
        System.out.println("resultado" +resultado);
    }catch (ArithmeticException e){
        System.out.println("Error: Divisao por zero nao e permitida.");
    }finally {
        System.out.println("Bloco finally: Sempre executado");
    }
    }
    public static int dividir(int a , int b){
        return a/b;
    }
}
