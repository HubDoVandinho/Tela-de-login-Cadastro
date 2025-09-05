package br.com.login.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import br.com.login.infra.ConfigLoader;

public class DatabaseConnection {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {

                Properties config = ConfigLoader.loadProperties();
                String url = config.getProperty("db.url");
                String user = config.getProperty("db.user");
                String password = config.getProperty("db.password");

                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado ao banco");
            } catch (Exception e) {
                System.out.println("Erro de conexão: " + e.getMessage());
            }
        }
        return connection;
    }
}