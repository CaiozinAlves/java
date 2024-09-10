package Pessoa;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Caio Rafael", LocalDate.of(2002, 11, 04), 1.80);
        pessoa.imprimirDados();
    }
}
