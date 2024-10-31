
package ecommerce;

// a gentre criou um class para A classe Cliente é um modelo que representa as informações de um cliente em um sistema de gerenciamento de um e-commerce.
// Aqui estão os principais aspectos da classe:
// com os atributos  abaixo cliente id , nome, email, telefone,data cadastro
//  a gente usou o contrutot  criar um novo cliente, todos os dados necessários estejam disponíveis no mysql
// uso tambem A classe inclui métodos "get" para acessar os valores dos atributos e métodos "set" para modificar os atributos.
// para ajudar no  encapsular a lógica e proteger os dados.
//O uso principal do toString() foi sobrescrito para fornecer uma representação legível do objeto Cliente.
// para exibir uma  informações do cliente de forma clara, como em um log ou na interface do usuário.
public class Cliente {
    private int Cliente_ID;
    private String Nome;
    private String Email;
    private String Telefone;
    private String Data_Cadastro;

    public Cliente(int Cliente_ID, String Nome, String Email, String Telefone, String Data_Cadastro) {
        this.Cliente_ID = Cliente_ID;
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Data_Cadastro = Data_Cadastro;
    }

    public int getCliente_ID() {
        return Cliente_ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getData_Cadastro() {
        return Data_Cadastro;
    }
    // Método toString para exibir o cliente de forma legível
    @Override
    public String toString() {
        return "Cliente_ID: " + Cliente_ID + ", Nome: " + Nome + ", Email: " + Email + ", Telefone: " + Telefone + ", Data_Cadastro: " + Data_Cadastro;
    }
}
