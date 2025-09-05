
package br.com.login.model;

import br.com.login.infra.ConfigLoader;
import br.com.login.infra.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO() {
        try {
            Properties props = ConfigLoader.loadProperties();
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            con = DatabaseConnection.getConnection();
            System.out.println("Conexao com o banco realizada com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao conectar com o banco: " + e.getMessage());
        }
    }

    public boolean cadastrarUsuario(String nome, String sobrenome, String email, String senha, String cpf) {
        try {
            String senhaHash = HashUtil.gerarHash(senha);
            String sql = "INSERT INTO usuarios (nome, sobrenome, email, senha, cpf) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, sobrenome);
            pst.setString(3, email);
            pst.setString(4, senhaHash);
            pst.setString(5, cpf);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar usuario: " + e.getMessage());
            return false;
        }
    }

    public boolean autenticar(String login, String senha) {
        boolean isCpf = login.matches("\\d+"); 
        String sql = isCpf ? "SELECT senha FROM usuarios WHERE cpf = ?" 
                           : "SELECT senha FROM usuarios WHERE email = ?";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, login);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String senhaHash = rs.getString("senha");
                return HashUtil.verificarHash(senha, senhaHash);
            }
        } catch (Exception e) {
            System.err.println("Erro ao autenticar: " + e.getMessage());
        }
        return false;
    }
}

