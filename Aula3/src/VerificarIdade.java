public class VerificarIdade {
        public  static void main(String[]arg){
            try {
                verificarIdade(34);
                verificarIdade(-5);
                verificarIdade(200);
        }catch (IllegalArgumentException e){
                System.out.println("Erro:"  +e.getMessage());
            }finally {
                System.out.println("Bloco Finally: Sempre executado");
            }
        }

        public static  void verificarIdade(int idade) {
            if (idade < 0 || idade > 150 ){
                throw new  IllegalArgumentException("Idade valida: " +idade +". A idade deve ser entre 0 e 150 anos.");

            }else {
                System.out.println("Idade valida e: " +idade);
            }
        }
        public static int dividir(int a, int b) {
        return a / b;
    }
}
