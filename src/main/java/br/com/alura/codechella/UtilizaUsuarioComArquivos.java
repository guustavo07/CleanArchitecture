package br.com.alura.codechella;

import br.com.alura.codechella.domain.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {
    public static void main(String[] args) {
        RepositorioeUsuarioEmArquivo repositorioeUsuarioEmArquivo = new RepositorioeUsuarioEmArquivo();

        repositorioeUsuarioEmArquivo.cadastrarUsuario((new Usuario("456.789.888-99", "joao", LocalDate.parse("2000-10-15"), "joao@gmail.com")));

        //System.out.println(repositorioeUsuarioEmArquivo.listarTodos());
        repositorioeUsuarioEmArquivo.gravaEmArquivo("usuario.txt");
    }
}
