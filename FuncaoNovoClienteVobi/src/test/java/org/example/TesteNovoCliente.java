package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import paginas.LoginPage;

public class TesteNovoCliente {

    Dotenv dotenv = Dotenv.load();
    String usuario = dotenv.get("USUARIO");
    String senha = dotenv.get("SENHA");
    private WebDriver navegador;

    @Test
    public void criandoNovoCliente(){

        //função que cria uma nova instancia do ChromeDriver (driver do Google Chrome)
        this.navegador = new ChromeDriver();

        //funções para acessar a plataforma e maximizar a tela
        this.navegador.navigate().to("https://plataforma.vobi.com.br/login/profissional");
        this.navegador.manage().window().maximize();

        new LoginPage(navegador)

                //funções para fazer o login na plataforma
                .informarUsuario(this.usuario)
                .informarSenha(this.senha)
                .submeterFormularioDeLogin()

                //função que acessa a paginda de "Meus Clientes"
                .listaClientes()

                //função que acessa o formulário "Cadastrar novo cliente"
                .novoCliente()

                //funções que preeemnchem o formulário de novo cliente
                .informarNomeCliente("João da Silva")
                .informarPessoaFisica()
                .informarDataNascimento("22/05/1995")
                .informarCPF("123.456.789-09")
                .informarRG("5.366.594-ES")
                .informarEmail("joaorosas@jmail.com")
                .informarTelefone("27999887766")
                .informarEndereco("Avenida as Flores")
                .informarNumero("3315")
                .informarCEP("29045118")
                .informarBairro("Jardins")
                .informarCidade("Roseiral")
                .informarComplemento("Casa verde aoo lado da farmacia")
                .selecionarEstadoCliente("DF - Distrito Federal")
                .informarObservacoes("BLAH BLAH BLAH")

                //função que submete o formulário de noovo cliente
                .submeterFormularioNovoCliente()

                //funções que conferem se o novo cliente foi registrado corretamente
                .conferirNomeCliente("João da Silva")
                .conferirEmailCliente("joaorosas@jmail.com")
                .conferirTelefoneCliente("27999887766");

        //função para fechar o navegador após o script ter rodado com sucesso
        navegador.quit();

    }

}
