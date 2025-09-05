

package br.com.login.model;

import java.security.MessageDigest;

public class HashUtil {


    public static String gerarHash(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(senha.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar hash: " + e.getMessage());
        }
    }


    public static boolean verificarHash(String senha, String hash) {
        String senhaHash = gerarHash(senha);
        return senhaHash.equals(hash);
    }
}
