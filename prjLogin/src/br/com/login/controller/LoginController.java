package br.com.login.controller;

import br.com.login.model.UsuarioDAO;

public class LoginController {

    private UsuarioDAO usuarioDAO;

    public LoginController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean fazerLogin(String login, String senha) {
        return usuarioDAO.autenticar(login, senha);
    }

}

