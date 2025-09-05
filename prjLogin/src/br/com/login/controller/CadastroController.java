package br.com.login.controller;

import br.com.login.model.UsuarioDAO;

public class CadastroController {

    private final UsuarioDAO usuarioDAO;

    public CadastroController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean cadastrarUsuario(String nome, String sobrenome, String email, String senha, String cpf) {
        return usuarioDAO.cadastrarUsuario(nome, sobrenome, email, senha, cpf);
    }
}