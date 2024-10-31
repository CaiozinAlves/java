
package ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Aqui e foi o codigo usando pra conexão com o banco de dados  onde
// será realizado o CRUD com as informações
public class ClienteDAO {
    private final String url = "jdbc:mysql://localhost:3307/ecommerce";
    private final String user = "root";
    private final String password = "catolica";

    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    // Aqui e onde a gente inseri um novo vliente no banco de daods
    public void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO Clientes(Cliente_ID, Nome, Email, Telefone, Data_Cadastro) VALUES (?,?,?,?,?)";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getCliente_ID());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getData_Cadastro());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // aqui em baixo e o retorno  de todos os clientes do banco de dados
    // que ja foi fornecido
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Clientes";
        try (Connection conn = conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                clientes.add(new Cliente(rs.getInt("Cliente_ID"), rs.getString("Nome"), rs.getString("Email"),
                        rs.getString("Telefone"), rs.getString("Data_Cadastro")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
//Aqui no BuscarCliente vamos buscar o ID dos cadastrados
    public Cliente buscarCliente(int clienteId) {
        String sql = "SELECT * FROM Clientes WHERE Cliente_ID = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, clienteId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(rs.getInt("Cliente_ID"), rs.getString("Nome"), rs.getString("Email"),
                        rs.getString("Telefone"), rs.getString("Data_Cadastro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//No atualizarCliente você pode atualizar uma informação, por exemplo o nome ou email
    public void atualizarCliente(Cliente cliente) {
        String sql = "UPDATE Clientes SET Nome = ?, Email = ?, Telefone = ? WHERE Cliente_ID = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());
            stmt.setInt(4, cliente.getCliente_ID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//excluirCliente você exclui o ID que quiser
    public void excluirCliente(int Cliente_ID) {
        String sql = "DELETE FROM Clientes WHERE Cliente_ID = ?";
        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, Cliente_ID);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
