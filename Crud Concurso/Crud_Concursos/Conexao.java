package Crud_Concursos;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/escola";
            String user = "root";
            String senha = ""; // ajuste conforme seu MySQL
            return DriverManager.getConnection(url, user, senha);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}
