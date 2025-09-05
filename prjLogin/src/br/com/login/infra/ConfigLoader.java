package br.com.login.infra;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    public static Properties loadProperties() {
        Properties props = new Properties();
        try {

            InputStream input = ConfigLoader.class.getResourceAsStream("/resources/config.properties");
            if (input == null) {
                throw new RuntimeException("Arquivo config.properties não encontrado!");
            }
            props.load(input);
            input.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar config.properties: " + e.getMessage());
        }
        return props;
    }
}