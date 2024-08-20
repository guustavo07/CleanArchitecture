package br.com.alura.codechella.domain;

import br.com.alura.codechella.domain.usuario.FabricaDeUsuario;
import br.com.alura.codechella.domain.usuario.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123456789-99", "Gustavo", LocalDate.parse("1998-09-08"), "email@email.com"));
    }
    @Test
    public void verificaIdadePermitida(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Emily", "123.456.789-00", LocalDate.parse("2000-10-02"));
        Assertions.assertTrue(usuario.isMaiorDeIdade());
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario(){
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Emily", "123.456.789-00", LocalDate.parse("2000-10-02"));
        Assertions.assertEquals("Emily", usuario.getNome());

        usuario = fabrica.incluiEndereco("11111-111", 40, "apto 202");
        Assertions.assertEquals("apto 202", usuario.getEndereco().getComplemento());
    }

}
