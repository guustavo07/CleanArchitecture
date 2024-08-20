package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.domain.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
